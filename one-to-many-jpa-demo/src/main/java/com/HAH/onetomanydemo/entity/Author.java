package com.HAH.onetomanydemo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "author")
	private List<Book> books = new ArrayList<>();

	public Author() {

	}

	public Author(String name) {
		this.name = name;
	}

	public void addBook(Book book) {
		book.setAuthor(this);
		this.books.add(book);
	}

	public void removeBook(Book book) {
		book.setAuthor(null);
		this.books.remove(book);
	}

}
