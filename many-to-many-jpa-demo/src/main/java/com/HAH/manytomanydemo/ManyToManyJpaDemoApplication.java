package com.HAH.manytomanydemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HAH.manytomanydemo.dao.StudentDao;
import com.HAH.manytomanydemo.service.StudentService;
import com.HAH.manytomanydemo.util.JPAUtil;

@SpringBootApplication
public class ManyToManyJpaDemoApplication implements CommandLineRunner {

	private StudentService studentService;

	public ManyToManyJpaDemoApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentService.createDb();
		JPAUtil.checkData("select * from student");
		JPAUtil.checkData("select * from subject");
		JPAUtil.checkData("select * from student_subjects");
	}

}
