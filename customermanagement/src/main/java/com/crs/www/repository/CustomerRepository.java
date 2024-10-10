package com.crs.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crs.www.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
