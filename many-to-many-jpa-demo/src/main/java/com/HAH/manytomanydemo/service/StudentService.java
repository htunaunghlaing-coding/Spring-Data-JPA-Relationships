package com.HAH.manytomanydemo.service;

import org.springframework.stereotype.Service;

import com.HAH.manytomanydemo.dao.StudentDao;
import com.HAH.manytomanydemo.entity.Student;
import com.HAH.manytomanydemo.entity.Subject;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

	private StudentDao studentDao;

	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Transactional
	public void createDb() {
		Student student1 = new Student("Htun", "Aung Hlaing", "htunaunghlaing177@gmai.com");
		Student student2 = new Student("Moe", "Thein", "mgmoe@gmail.com");
		Student student3 = new Student("Aye", "Thazin Khaing", "makhaing@gmail.com");

		Subject subject1 = new Subject("Java Basic", 3, 100000);
		Subject subject2 = new Subject("Spring Framework", 4, 200000);
		Subject subject3 = new Subject("Angular", 3, 200000);

		student1.addSubject(subject1);
		student1.addSubject(subject2);
		student1.addSubject(subject3);
		student2.addSubject(subject1);
		student3.addSubject(subject1);

		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
	}

}
