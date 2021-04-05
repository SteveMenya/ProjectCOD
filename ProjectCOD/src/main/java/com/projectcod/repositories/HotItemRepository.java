package com.projectcod.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projectcod.models.HotItem;

public interface HotItemRepository extends CrudRepository<HotItem, String> {
	public Iterable<HotItem> findAll();
}
