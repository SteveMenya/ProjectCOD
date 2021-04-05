package com.projectcod.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.projectcod.models.Item;

public interface ItemRepository extends CrudRepository<Item,String> {
	public Item findByItemName(String  itemName);
	//public List<Item>  findAll();
	
	public Iterable<Item> findAll();
	

}
