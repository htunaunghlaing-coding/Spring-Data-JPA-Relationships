package com.HAH.onetomanydemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private double price;
	private String genre;

	@ManyToOne
	private Author author;

	public Book() {

	}

	public Book(String title, double price, String genre) {
		this.title = title;
		this.price = price;
		this.genre = genre;
	}

}
