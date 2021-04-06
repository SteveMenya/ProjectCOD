package com.projectcod.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectcod.models.CustomerFeedBack;
import com.projectcod.repositories.CustomerFeedBackRepository;


@Service
public class CustomerFeedBackService {
	
	private CustomerFeedBackRepository customerFeedBackRepository;
	
	@Autowired
	public CustomerFeedBackService(CustomerFeedBackRepository customerFeedBackRepository) {
		this.customerFeedBackRepository = customerFeedBackRepository;
	}
	
	public void saveFeedBack(CustomerFeedBack customerFeedBack) {
		customerFeedBackRepository.save(customerFeedBack);
	}
	public CustomerFeedBack customerFeedBack(String email) {
		return customerFeedBackRepository.findByEmail(email);
	}
		
}
