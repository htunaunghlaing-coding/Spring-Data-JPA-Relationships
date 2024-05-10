package com.HAH.manytomanydemo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends IdClass {

	private String first_name;
	private String last_name;
	private String email;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Subject> subjects = new ArrayList<>();

	public Student() {

	}

	public Student(String first_name, String last_name, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public void addSubject(Subject subject) {
		subject.getStudents().add(this);
		this.subjects.add(subject);
	}

}
