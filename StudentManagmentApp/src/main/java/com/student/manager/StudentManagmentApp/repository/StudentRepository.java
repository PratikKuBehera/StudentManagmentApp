package com.student.manager.StudentManagmentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.manager.StudentManagmentApp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	

}

