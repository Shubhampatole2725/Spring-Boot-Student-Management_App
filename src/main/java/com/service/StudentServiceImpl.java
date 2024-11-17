package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository repository;

	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}
	
	@Override
	public boolean loginCheck(String username, String password) {
		if(username.equalsIgnoreCase("admin") && password.equals("admin@123")) {
			return true;
		}
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		Iterable<Student> stuList = repository.findAll();
		List<Student> list = (List<Student>)stuList;
		return list;
	}
	
	@Override
	public List<Student> deleteStudent(int rollNo) {
		System.out.println("Delete in Service");
		repository.deleteById(rollNo);
		return getAllStudent();
	}
	@Override
	public Student getStudent(int rollNo) {
		return repository.findById(rollNo).get();
	}
	@Override
	public List<Student> updateStudent(Student student) {
		repository.save(student);
		return getAllStudent();
	}
}