package com.HAH.onetomanydemo.service;

import org.springframework.stereotype.Service;

import com.HAH.onetomanydemo.dao.AuthorDao;
import com.HAH.onetomanydemo.entity.Author;
import com.HAH.onetomanydemo.entity.Book;

import jakarta.transaction.Transactional;

@Service
public class BookService {

	private AuthorDao authorDao;

	public BookService(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Transactional
	public void addNewBookWithExistingAuthor() {
		Author author = getAuthorName();
		author.addBook(new Book("Clara and Sun", 30, "Sci-Fi"));
	}

	private Author getAuthorName() {
		return authorDao.findAuthorByName("Ishiguro");
	}

	@Transactional
	public void removeFirstBookWithExistingAuthor() {
		Author author = getAuthorName();
		author.removeBook(author.getBooks().get(0));
	}

	@Transactional
	public void removeLastBookWithExistingAuthor() {
		Author author = getAuthorName();
		author.removeBook(author.getBooks().get(author.getBooks().size() - 1));
	}

	@Transactional
	public void saveAuthorWithThreeBooks() {
		Author author = new Author("Ishiguro");
		Book book1 = new Book("A pale of view hills", 35.3, "Novel");
		Book book2 = new Book("Don't let me go", 45.3, "Novel");
		Book book3 = new Book("The remains of the day", 30.3, "Novel");

		author.addBook(book1);
		author.addBook(book2);
		author.addBook(book3);

		authorDao.save(author);
	}

}
