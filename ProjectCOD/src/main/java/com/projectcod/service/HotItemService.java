package com.projectcod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcod.models.HotItem;
import com.projectcod.repositories.HotItemRepository;


@Service
public class HotItemService {
	private HotItemRepository hotItemRepository;
	
	@Autowired
	public HotItemService(HotItemRepository hotItemRepository) {
		this.hotItemRepository = hotItemRepository;
	}
	public Iterable<HotItem> findAll() {
		return hotItemRepository.findAll();
	}
}
