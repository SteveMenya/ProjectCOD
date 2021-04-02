package com.projectcod.repositories;

import javax.validation.constraints.Email;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.projectcod.models.Customer;


@Service
public interface CustomerRepository extends CrudRepository<Customer, Email> {
	public Customer findByEmail(String  email);

}
