package com.mphasis.demo.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.demo.entities.Assignment;
import com.mphasis.demo.entities.Student;

@Repository
public class AssignmentDaoImp implements AssignmentDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Assignment> getAssinments() {
		Session session=sessionFactory.openSession();
		List<Assignment> assignments=
			session.createCriteria(Assignment.class).list();
		return assignments;
	}

	public Assignment getAssignmentById(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Assignment st=(Assignment)session.get(Assignment.class, id);
		tr.commit();
		return st;
	}

	public void insertAssignment(Assignment assignment) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(assignment);
		tr.commit();

	}

	public void updateAssignment(Assignment assignment) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(assignment);
		tr.commit();

	}

	public void deleteAssignment(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Assignment assignment=(Assignment)session.get(Assignment.class, id);
		session.delete(assignment);
		tr.commit();

	}

}
