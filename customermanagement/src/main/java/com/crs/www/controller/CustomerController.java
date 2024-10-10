package com.crs.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crs.www.model.Customer;
import com.crs.www.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custService;
	
	@PostMapping("/add")
	 public String addCustomer(@RequestBody Customer cust)
	 {
		 Customer c=custService.addCustomer(cust);
		 return "Customer added Sucessfully";
	 }
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		custService.deleteById(id);
		return "customer deleted sucessfully";
	}
	
	@GetMapping("/all")
	public List<Customer> finEvery()
	{
		List<Customer> list=custService.findEvery();
		return list;
	}
	
	@GetMapping("/get/{id}")
	public Customer getById(@PathVariable int id)
	{
		return custService.getById(id);
	}
	
	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return custService.updateCustomer(customer);
		
	}

}
