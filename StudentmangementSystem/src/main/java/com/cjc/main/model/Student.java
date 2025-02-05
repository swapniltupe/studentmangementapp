package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int studentId;
private String studentFullName;
private String studentEmail;
private int studentAge;
private String studentCollageName;
private String studentCourse;
private String batchNumber;
private String batchMode;
private double fesspaid;

public String getBatchMode() {
	return batchMode;
}
public void setBatchMode(String batchMode) {
	this.batchMode = batchMode;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentFullName() {
	return studentFullName;
}
public void setStudentFullName(String studentFullName) {
	this.studentFullName = studentFullName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public String getStudentCollageName() {
	return studentCollageName;
}
public void setStudentCollageName(String studentCollageName) {
	this.studentCollageName = studentCollageName;
}
public String getStudentCourse() {
	return studentCourse;
}
public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
public String getBatchNumber() {
	return batchNumber;
}
public void setBatchNumber(String batchNumber) {
	this.batchNumber = batchNumber;
}
public double getFesspaid() {
	return fesspaid;
}
public void setFesspaid(double fesspaid) {
	this.fesspaid = fesspaid;
}



}
