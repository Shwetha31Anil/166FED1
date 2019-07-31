package com.mphasis.demo.daos;

import java.util.List;

import com.mphasis.demo.entities.Student;

public interface StudentDao {
	
	public List<Student> getStudents();
	public Student getStudentById(int id);
	public void insertStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	

}
