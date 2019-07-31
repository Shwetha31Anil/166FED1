package com.mphasis.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.demo.bos.StudentBo;
import com.mphasis.demo.entities.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentBo studentBo;
	
	@RequestMapping(value="/students", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAll(){
		return studentBo.getStudents();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public void addStudent(@RequestBody Student student) {
		studentBo.addStudent(student);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.PUT,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
	Student st=	studentBo.getStudentById(student.getId());
	if(st!=null)
		studentBo.editStudent(student);
	else
		studentBo.addStudent(student);
	}
	
	@RequestMapping(value="/add/{id}", method=RequestMethod.DELETE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteStudent(@PathVariable("id")int id) {
		studentBo.removeStudent(id);
	}
	
	@RequestMapping(value="/student/{id}", 
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent(@PathVariable("id")int id) {
		return studentBo.getStudentById(id);
	}

}
