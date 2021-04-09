package com.projectcod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.projectcod.service.ItemService;

@Controller
public class ItemController {
	
	private ItemService itemService;

	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService= itemService;
	}	
	
	@GetMapping("featured")
	public String featured(ModelMap modelMap) {
		modelMap.put("items", itemService.findByType("featured"));
		return "featured";
	}
	
	@GetMapping("hotdrinks")
	public String hotDrinks(ModelMap modelMap) {
		modelMap.put("items", itemService.findByType("hot"));
		return "hotdrinks";
	}
	
	@GetMapping("colddrinks")
	public String coldDrinks(ModelMap modelMap) {
		modelMap.put("items", itemService.findByType("frozen"));
		return "colddrinks";
	}

}
