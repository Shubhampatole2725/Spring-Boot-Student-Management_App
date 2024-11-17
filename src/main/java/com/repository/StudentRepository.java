package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
