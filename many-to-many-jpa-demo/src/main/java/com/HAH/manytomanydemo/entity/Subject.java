package com.HAH.manytomanydemo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subject extends IdClass {

	private String name;
	private int duration;
	private double price;
	
	@ManyToMany(mappedBy = "subjects")
	private List<Student> students = new ArrayList<>();

	public Subject() {

	}

	public Subject(String name, int duration, double price) {
		this.name = name;
		this.duration = duration;
		this.price = price;
	}

}
