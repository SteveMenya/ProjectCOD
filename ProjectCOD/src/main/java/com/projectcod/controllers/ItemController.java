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
		this.itemService = itemService;
	}

	@GetMapping("featured")
	public String featured(ModelMap modelMap) {
		modelMap.put("items", itemService.findByType("featured"));

		return "featured";
	}

	/*
	 * @PostMapping("./featured/addToOrder") public String addToOrder(@Valid Item
	 * item, BindingResult result, HttpServletRequest request, Model model) {
	 * 
	 * HttpSession session = request.getSession(); Item newItem = new Item(); Order
	 * order = new Order();
	 * 
	 * String itemName = request.getParameter("itemName"); String itemCost =
	 * request.getParameter("itemCost"); String description =
	 * request.getParameter("description");
	 * 
	 * model.addAttribute("item", item); newItem.setItemName(itemName);
	 * newItem.setItemCost(itemCost); newItem.setDescription(description);
	 * newItem.getOrder(); return null; }
	 */

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

	@GetMapping("merchandise")
	public String merchandise(ModelMap modelMap) {
		modelMap.put("items", itemService.findByType("merch"));
		return "merchandise";
	}

}
