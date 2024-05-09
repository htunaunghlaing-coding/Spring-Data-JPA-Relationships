package com.HAH.onetoonedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String streetName;
	private String streetNumber;
	private String city;
	
	@JoinColumn(name = "customer_id_fk")
	@OneToOne
	private Customer customer;

	public Address() {
		
	}
	public Address(String streetName, String streetNumber, String city) {
		super();
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
	}

}
