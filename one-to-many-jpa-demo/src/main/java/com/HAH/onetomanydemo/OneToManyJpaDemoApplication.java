package com.HAH.onetomanydemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HAH.onetomanydemo.service.BookService;
import com.HAH.onetomanydemo.util.JPAUtil;

@SpringBootApplication
public class OneToManyJpaDemoApplication implements CommandLineRunner{
	
	private BookService bookService;

	public OneToManyJpaDemoApplication(BookService bookService) {
		this.bookService = bookService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToManyJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.saveAuthorWithThreeBooks();
		System.out.println("----------------------------------------");
		bookService.addNewBookWithExistingAuthor();
		System.out.println("----------------------------------------");
		bookService.removeFirstBookWithExistingAuthor();
		System.out.println("----------------------------------------");
		bookService.removeLastBookWithExistingAuthor();
		System.out.println("----------------------------------------");
		JPAUtil.checkData("select * from book");
		JPAUtil.checkData("select * from author");
		//JPAUtil.checkData("select * from author_books");
	}

}
