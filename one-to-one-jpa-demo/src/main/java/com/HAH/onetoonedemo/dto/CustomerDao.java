package com.HAH.onetoonedemo.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HAH.onetoonedemo.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	
}
