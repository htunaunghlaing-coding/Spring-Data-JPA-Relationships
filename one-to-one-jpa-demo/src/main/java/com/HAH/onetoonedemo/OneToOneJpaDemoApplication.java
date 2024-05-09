package com.HAH.onetoonedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HAH.onetoonedemo.service.CustomerService;
import com.HAH.onetoonedemo.util.JPAUtil;

@SpringBootApplication
public class OneToOneJpaDemoApplication implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerService.createDB();
		JPAUtil.checkData("select * from customer");
		JPAUtil.checkData("select * from address");
	}

}
