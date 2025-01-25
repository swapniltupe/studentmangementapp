package com.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepositary;
import com.cjc.main.service.StudentServiceI;



@Service
public class StudentServiceImpl  implements StudentServiceI{

	@Autowired
	StudentRepositary sr;
	
	@Override
	public void saveStudent(Student s) {
		sr.save(s);
		
	}

	

	@Override
	public void deleteStudent(int id) {
		
		sr.deleteById(id);
	}



	@Override
	public List<Student> getAllStudents() {
		
		return sr.findAll();
	}



	@Override
	public List<Student> searchStudentsByBatch(String batchNumber) {
		
		return sr.findByBatchNumber(batchNumber);
	}



	@Override
	public Student getStudentById(int id) {
		Student s    =  sr.findById(id).get();
		return s;
	}



	@Override
	public void updateFees(int studentId, double ammount) {
		Student s=sr.findById(studentId).get();
      	double amt=s.getFesspaid()+ammount;
      	
      	s.setFesspaid(amt);
      	sr.save(s);
	}

}
