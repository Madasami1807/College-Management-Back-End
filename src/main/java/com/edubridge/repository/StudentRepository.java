package com.edubridge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Student findById(int id); 

}
