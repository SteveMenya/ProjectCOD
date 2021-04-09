package com.projectcod.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projectcod.models.Customer;
import com.projectcod.service.CustomerService;


@Controller
public class HomeController {
	private CustomerService customerService;
	
	@Autowired
	public HomeController(CustomerService customerService) {
		this.customerService = customerService;
	}
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String showMenu() {
		return "menu";
	}

	@GetMapping("/sign-in")
	public String showSignInPage() {
		return "sign-in";
	}
	@GetMapping("/register") 
	public String showregisterPage(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-registration";
}
	
	//Saves new users in the database
		@PostMapping("/register")
		//@Valid verifies if the data entered is correct and adds it to BindingResult
		public String registerNewCustomer(@Valid @ModelAttribute("customer") Customer customer,
				BindingResult result ) {
			if(result.hasErrors()) {
				return "customer-registration";
			}
			customerService.saveCustomer(customer);
			System.out.println(customer.toString());
			return "redirect:/sign-in";
		}

	@PostMapping("/sign-in")
	public String processLoginRequest(@ModelAttribute("email") String email,
			@RequestParam("password") String password, Model model, HttpSession session) {
		Customer customer = customerService.findCustomerEmail(email);
		
		if(customer != null && password.equals(customer.getPassword())) {
			session.setAttribute("currentCustomer", customer); //dispays username
			 //session.setAttribute("currentCustomer", customer.displayCustomerOrders());
			return "welcome";	
			
		}
		else {
			model.addAttribute("LoginFailedMessage", "Login Invalid");
			//System.out.println("Login Failed");
			return "sign-in";
		}
		
	}
	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

}
