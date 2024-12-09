package com.student.manager.StudentManagmentApp.service;

import java.util.List;

import com.student.manager.StudentManagmentApp.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public Student saveStudent( Student s);
	
	public Student getById(int id);
	
	public void deletById(int id);

}
