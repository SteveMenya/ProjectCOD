package com.projectcod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcod.models.Customer;
import com.projectcod.repositories.CustomerRepository;

@Service
public class CustomerService {
		private CustomerRepository customerRepository;
		
		@Autowired
		public CustomerService(CustomerRepository customerRepository) {
			this.customerRepository = customerRepository;
		}
		
		public void createHardCodedCustomer(Customer customer) {
			customerRepository.save(customer);
		}
		public void saveCustomer(Customer customer) {
			customerRepository.save(customer);
		}
		public Customer findCustomerEmail(String email) {
			return customerRepository.findByEmail(email);
		}
}
