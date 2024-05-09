package com.HAH.onetoonedemo.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HAH.onetoonedemo.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
