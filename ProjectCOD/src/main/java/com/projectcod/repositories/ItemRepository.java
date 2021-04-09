package com.projectcod.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectcod.models.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {
	public Item findByItemName(String  itemName);
	
	//finds items by type column
	public List<Item> findByType(String type);
	
	public Iterable<Item> findAll();
	

}
