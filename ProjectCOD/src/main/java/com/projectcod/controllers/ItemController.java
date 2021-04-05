package com.projectcod.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projectcod.models.Customer;
import com.projectcod.models.Item;
import com.projectcod.service.ItemService;

@Controller
public class ItemController {
	//old-private ItemService itemService;
	
	private ItemService itemService;
	
	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService= itemService;
	}
	
	@GetMapping("featured")
	public String index(ModelMap modelMap) {
		modelMap.put("items", itemService.findAll());
		return "featured";
	}
	//@Autowired
	//public ItemController(ItemService itemService) {
	//	this.itemService = itemService;
//	}
//	@PostMapping("/featured")
//	public String processLoginRequest(@ModelAttribute("itemName") String itemName,
//		Model model, HttpSession session) {
//		List<Item> item = itemService.findAll();
//		
//		
//		if(item != null ) 
//			session.setAttribute("currentItems", item); //dispays username
//			//System.out.println("Login succeeded");
//			return "featured";		
//			
//	}
//	@GetMapping("/featured")
//	public ModelAndView index(ModelAndView modelAndView) {
//		List<Item>  items= itemService.findAll();
//		System.out.println("----------------------------new Line-------------------");
//		System.out.println(items);
//		
//		modelAndView.addObject("items", items);
//		modelAndView.setViewName("featured");
//		
//		return modelAndView;
//	}
//	@RequestMapping(method = RequestMethod.GET)
//	public ModelAndView index(ModelAndView modelAndView) {
//		modelAndView.addObject("items", itemService.findAll());
//		modelAndView.setViewName("featured");
//		
//		return modelAndView;
//	}
//	@RequestMapping(method = RequestMethod.GET)
//	public String index(ModelMap modelMap) {
//		modelMap.put("items", itemService.findAll());
//		return "featured";
//	}
	
//	@GetMapping("/featured")
//	public String displayFeaturedItems(@ModelAttribute("item_name") String itemName,
//			Model model, HttpSession session) {			
//		Item item = itemService.finditemName(itemName);
//		
//		session.setAttribute("items", item);
//		return "featured";
//	}
}
