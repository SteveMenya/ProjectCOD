package com.projectcod.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.projectcod.models.Customer;


public interface CustomerRepository extends CrudRepository<Customer, String> {
	public Customer findByEmail(String  email);
	
}
