package com.projectcod.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectcod.models.Customer;
import com.projectcod.models.Order;

public interface OrderRepository extends CrudRepository<Order, Integer > {
	public List<Order> findByCustomer(Customer customer);
}
