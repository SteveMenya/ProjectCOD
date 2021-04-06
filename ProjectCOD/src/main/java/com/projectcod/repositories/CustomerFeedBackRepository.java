package com.projectcod.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projectcod.models.CustomerFeedBack;

public interface CustomerFeedBackRepository extends CrudRepository<CustomerFeedBack, String> {
		public CustomerFeedBack findByEmail(String email);
}
