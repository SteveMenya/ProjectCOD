package com.projectcod.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@GetMapping("/menu")
	public String showMenu() {
		return "menu";
	}
	@GetMapping("/merchandise")
	public String showAboutPage() {
		return "merchandise";
	}
	@GetMapping("/contact-us")
	public String showContactUsPage() {
		return "contact-us";
	}
	@GetMapping("/sign-in")
	public String showSignInPage() {
		return "sign-in";
	}
	@GetMapping("/featured")
	public String showFeaturedPage() {
		return "featured";
	}
	@GetMapping("/colddrinks")
	public String showColdDrinksPage() {
		return "colddrinks";
	}
	@GetMapping("/hotdrinks")
	public String showHotDrinksPage() {
		return "hotdrinks";
	}
}
