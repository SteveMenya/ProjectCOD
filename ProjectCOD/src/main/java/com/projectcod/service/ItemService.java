package com.projectcod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcod.models.Item;
import com.projectcod.repositories.ItemRepository;

@Service
public class ItemService {
		private ItemRepository itemRepository;
		
		@Autowired
		public ItemService(ItemRepository itemRepository) {
			this.itemRepository = itemRepository;
		}
		public void createHardCodedItem(Item item) {
			itemRepository.save(item);
		}
		public void saveItem(Item item) {
			itemRepository.save(item);
		}
		public Item finditemName(String itemName) {
			return itemRepository.findByItemName(itemName);
		}
		public Iterable<Item> findAll() {
			return itemRepository.findAll();
		}
		//public List<Item> findAll() { 
		//	return itemRepository.findAll();
		//}
		
}
