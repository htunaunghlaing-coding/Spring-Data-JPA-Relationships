package com.HAH.manytomanydemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HAH.manytomanydemo.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

}
