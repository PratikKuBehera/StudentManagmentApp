package com.student.manager.StudentManagmentApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentId")
	int studentId;
	
	@Column(name="Firstname")
	String Firstname;
	
	@Column(name="Lastname")
	String Lastname;
	
	@Column(name="Email")
	String Email;
	
	@Column(name="Address")
	String Address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Student(int studentId, String firstname, String lastname, String email, String address) {
		super();
		this.studentId = studentId;
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Address = address;
	}

	public Student(String firstname, String lastname, String email, String address) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Address = address;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email="
				+ Email + ", Address=" + Address + "]";
	}
	

}
