package com.crs.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.crs.www.model.Customer;
import com.crs.www.repository.CustomerRepository;
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custRepo;
	
	public Customer addCustomer(Customer customer)
	{
		Customer c=custRepo.save(customer);
		return c;
		
	}
	@CacheEvict(value="customers",allEntries=true)
	public void deleteById(int id)
	{
		custRepo.deleteById(id);
	}
	
	public List<Customer> findEvery()
	{
		
		return custRepo.findAll();
	}
	@Cacheable(value="customers",key="#id")
	public Customer getById(int id)
	{
		return custRepo.findById(id).get();
	}
	@CachePut(value="customers",key="#cust")
	public String updateCustomer(Customer cust)
	{
		Customer customer=custRepo.findById(cust.getCustId()).get();
		customer.setCustName(cust.getCustName());
		customer.setCustAdd(cust.getCustAdd());
		custRepo.save(customer);
		return "Customer Updated";
		
	}

}
