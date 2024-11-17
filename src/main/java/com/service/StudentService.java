package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	public void saveStudent(Student student);

	public boolean loginCheck(String username, String password);

	public List<Student> getAllStudent();

	public List<Student> deleteStudent(int rollNo);

	public Student getStudent(int rollNo);

	public List<Student> updateStudent(Student student);

}
