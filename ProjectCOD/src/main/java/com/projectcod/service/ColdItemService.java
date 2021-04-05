package com.projectcod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcod.models.ColdItem;
import com.projectcod.repositories.ColdItemRepository;


@Service
public class ColdItemService {
	private ColdItemRepository coldItemRepository;
	
	@Autowired
	public ColdItemService(ColdItemRepository coldItemRepository) {
		this.coldItemRepository = coldItemRepository;
	}
	public Iterable<ColdItem> findAll() {
		return coldItemRepository.findAll();
	}
}
