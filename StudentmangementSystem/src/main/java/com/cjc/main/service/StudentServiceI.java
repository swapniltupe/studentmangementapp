package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;


public interface StudentServiceI {

	List<Student> getAllStudents();

	void saveStudent(Student s);

	List<Student> searchStudentsByBatch(String batchNumber);

	Student getStudentById(int id);

	void updateFees(int studentId, double ammount);

	void deleteStudent(int id);
	

	
	
	}
