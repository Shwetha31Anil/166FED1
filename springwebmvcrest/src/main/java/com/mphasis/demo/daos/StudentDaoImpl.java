package com.mphasis.demo.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.demo.entities.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Student> getStudents() {
		Session session=sessionFactory.openSession();
		List<Student> students=
			session.createCriteria(Student.class).list();
		return students;
	}

	public Student getStudentById(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Student st=(Student)session.get(Student.class, id);
		tr.commit();
		return st;
	}

	public void insertStudent(Student student) {
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
	session.save(student);
	tr.commit();
	}

	public void updateStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
	}

	public void deleteStudent(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Student st=(Student)session.get(Student.class, id);
		session.delete(st);
		tr.commit();

	}

}
