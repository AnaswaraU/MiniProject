package com.miniproject.sms.service;

import java.util.List;

import com.miniproject.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

}