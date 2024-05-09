package com.HAH.onetoonedemo.service;

import org.springframework.stereotype.Service;

import com.HAH.onetoonedemo.dto.AddressDao;
import com.HAH.onetoonedemo.dto.CustomerDao;
import com.HAH.onetoonedemo.entity.Address;
import com.HAH.onetoonedemo.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {

	private CustomerDao customerDao;
	
	private AddressDao addressDao;
	
	public CustomerService(CustomerDao customerDao, AddressDao addressDao) {
		
		this.customerDao = customerDao;
		this.addressDao = addressDao;
	}

	@Transactional
	public void createDB() {
		Customer customer1 = new Customer("Htun Aung Hlaing","0966778899","htunaunghlaing177@gmail.com");
		Customer customer2 = new Customer("Hsu Lae Hnin","09763651040","ariel@gmail.com");
		Address address1 = new Address("Sanpya", "No 18", "Mogok");
		Address address2 = new Address("Bokhone", "No 19", "Mogok");
		
		customer1.setAddress(address1);
		customer2.setAddress(address2);
		address1.setCustomer(customer1);
		address2.setCustomer(customer2);
		
		customerDao.save(customer1);
		customerDao.save(customer2);
		addressDao.save(address1);
		addressDao.save(address2);
		
	}
	
	

}
