package com.projectcod.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.projectcod.models.CustomerFeedBack;
import com.projectcod.service.CustomerFeedBackService;

@Controller
public class FeedBackController {
	private CustomerFeedBackService customerFeedBackService;
	
	@Autowired
	public FeedBackController(CustomerFeedBackService customerFeedBackService) {
		this.customerFeedBackService = customerFeedBackService;
	}
	
	@GetMapping("/contact-us") 
	public String showregisterPage(Model model) {
		model.addAttribute("feedback", new CustomerFeedBack());
		return "contact-us";
}
	//Saves customer feedback
			@PostMapping("/contact-us")
			public String saveCustomerFeedback(@Valid @ModelAttribute("feedback") CustomerFeedBack customerFeedBack,
					BindingResult result ) {
				if(result.hasErrors()) {
					return "contact-us";
				}
				customerFeedBackService.saveFeedBack(customerFeedBack);
				return "index";
			}

}
