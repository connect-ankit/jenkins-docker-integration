package com.inn.ccm.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.inn.ccm.student.model.Student;

@Transactional(propagation = Propagation.NEVER)
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
