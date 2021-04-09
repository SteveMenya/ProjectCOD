package com.projectcod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcod.models.Customer;
import com.projectcod.models.Order;
import com.projectcod.repositories.ItemRepository;
import com.projectcod.repositories.OrderRepository;

@Service
public class OrderService {
	private  OrderRepository orderRepository;
	
	@Autowired
	public OrderService(ItemRepository itemRepository) {
		this.orderRepository = orderRepository;
	}
	
	public List<Order> findByCustomer(Customer customer) {
		return orderRepository.findByCustomer(customer);
	}
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}
	public void deleteOrder(Order order) {
		orderRepository.delete(order);
	}
	
}
