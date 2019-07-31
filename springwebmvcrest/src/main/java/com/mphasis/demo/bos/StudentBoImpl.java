package com.mphasis.demo.bos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.demo.daos.StudentDao;
import com.mphasis.demo.entities.Student;
import com.mphasis.demo.exceptions.BuissnesException;

@Service
public class StudentBoImpl implements StudentBo {
	@Autowired
	StudentDao studentDao;

	public List<Student> getStudents() {
		List<Student> students=studentDao.getStudents();
		if(students.isEmpty()) {
			throw new BuissnesException("No Student");
		}
		return students;
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(id);
	}

	public void addStudent(Student student) {
		studentDao.insertStudent(student);

	}

	public void editStudent(Student student) {
		// TODO Auto-generated method stub
			studentDao.updateStudent(student);
	}

	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
	}

}
