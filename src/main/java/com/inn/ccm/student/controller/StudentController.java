package com.inn.ccm.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.ccm.student.model.Student;
import com.inn.ccm.student.servcie.IStudentService;
import com.inn.ccm.student.servcie.StudentservcieImpl;

@RestController
@RequestMapping(path="/Student")
public class StudentController {

	
	
	IStudentService service=new StudentservcieImpl();
	
	
	  @GetMapping(path="findAll")
	  List<Student> findAll(){
		 return service.getAllStudent();
	 }
	  
	 
	  @PostMapping(path="addStudent")
	  Student addStudent(@RequestBody Student s) {
		
		  System.out.println("Inside addStudent :{}"+s);
		  return service.addStudent(s);
	 }
	  
	  
	  
	  
	  
	  @PostMapping(path="addStudentByRef")
	Student   addStudentByRef(@RequestBody Student s) {
		
		  System.out.println("Inside addStudent :{}"+s);
		  return null;
	 }
	  
	  
	  
	  
	 @GetMapping(path="isAlive")
	 Boolean isAlive(){
		 return true;
	 }
 
}
