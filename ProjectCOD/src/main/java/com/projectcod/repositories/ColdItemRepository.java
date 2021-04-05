package com.projectcod.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projectcod.models.ColdItem;

public interface ColdItemRepository extends CrudRepository<ColdItem,String > {
	public Iterable<ColdItem> findAll();
}
