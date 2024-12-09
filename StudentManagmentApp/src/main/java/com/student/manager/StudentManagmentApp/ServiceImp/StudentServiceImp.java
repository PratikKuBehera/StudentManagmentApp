package com.student.manager.StudentManagmentApp.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.manager.StudentManagmentApp.entity.Student;
import com.student.manager.StudentManagmentApp.repository.StudentRepository;
import com.student.manager.StudentManagmentApp.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
    
	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student s) {
		return studentRepository.save(s);
	}


	@Override
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public void deletById(int id) {

		studentRepository.deleteById(id);
	}


	
	


}
