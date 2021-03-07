package com.inn.ccm.student.servcie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.inn.ccm.student.model.Student;
import com.inn.ccm.student.repository.AddressRepo;
import com.inn.ccm.student.repository.StudentRepo;

@Service
public class StudentservcieImpl implements IStudentService{

	@Lookup
	StudentRepo studentrepo() {
		return null;
	}
	
	
	@Autowired
	AddressRepo repo;
	
	
	
	@Override
	public Student addStudent(Student createdObj) {
		
		
		return studentrepo().save(createdObj);
	}
	@Override
	public List<Student> getAllStudent() {
		
		return (List<Student>) studentrepo().findAll();
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Student addStudentByRef(Student createdObj) {
			return studentrepo().save(createdObj);
	}
	
	
}
