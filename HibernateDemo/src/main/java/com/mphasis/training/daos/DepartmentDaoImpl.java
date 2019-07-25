package com.mphasis.training.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mphasis.training.beans.Department;
import com.mphasis.training.beans.Employee;
import com.mphasis.training.conf.HibernateUtil;

public class DepartmentDaoImpl implements DepartmentDao {

	SessionFactory sessionFactory;
	public DepartmentDaoImpl() {
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	@Override
	public void addDepartment(Department d) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			session.save(d);
			tr.commit();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void updatedepartment(Department d) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			session.update(d);
			tr.commit();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void deletDepartment(int did) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			Department e=(Department) session.get(Department.class, did);
			session.delete(e);
			tr.commit();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public Department getDepartmentById(int did) {
		Department d=null;
		try {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			d=(Department) session.get(Department.class,did);
			tr.commit();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return d;
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
