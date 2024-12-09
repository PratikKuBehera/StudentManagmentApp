package com.student.manager.StudentManagmentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.manager.StudentManagmentApp.ServiceImp.StudentServiceImp;
import com.student.manager.StudentManagmentApp.entity.Student;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	StudentServiceImp service;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";//-->home page-html
		
	}
	
	@GetMapping("/student")
	public String getAllStudents(Model model) {
		
		model.addAttribute("students", service.getAllStudent());
		
		return "student";
		
	}
	
	@GetMapping("student/addstudent")
	public String createStudent(Model model) {
		
		Student s = new Student();
		model.addAttribute("students", s);
		
		return "create-student";
		
	}
	
	@PostMapping("/studentss")
	public String addStudent(@ModelAttribute("students") Student s) {
		service.saveStudent(s);
		
		return "redirect:/student";
		
	}
	
	@GetMapping("/student/edit{id}")
	public String editById(@PathVariable int id ,Model model ) {
		
		model.addAttribute("student", service.getById(id));
		
		return "editSudent";
		
		
	}
	
	
	@PostMapping("/students/edit{id}")
	public String updateStudent(@PathVariable int id , @ModelAttribute("student") Student s) {
		
		Student editexistingstudent = service.getById(id);
		
		editexistingstudent.setFirstname(s.getFirstname());
		editexistingstudent.setLastname(s.getLastname());
		editexistingstudent.setEmail(s.getEmail());
		editexistingstudent.setAddress(s.getAddress());
		
		
		service.saveStudent(editexistingstudent);
		
		return "redirect:/student";
		
	}
	
	
	@GetMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id ) {
		
		
		service.deletById(id);
		
		return "redirect:/student";
	}
	

}
