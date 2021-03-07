package com.inn.ccm.student.servcie;

import java.util.List;

import com.inn.ccm.student.model.Student;

public interface IStudentService {
	Student addStudent(Student s);
	List<Student> getAllStudent();
	Student addStudentByRef(Student createdObj);
	
}