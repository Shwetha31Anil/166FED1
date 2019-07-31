package com.mphasis.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.training.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Customer login(String email, String pass)throws Exception {
		Customer customer=null;
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session
		.createQuery("from Customer where cemail=:cemail and cpass=:cpass");
		query.setString("cemail", email);
		query.setString("cpass", pass);
		try {
		customer=(Customer)query.uniqueResult();
		System.out.println(customer.getCemail());
		tr.commit();
		}catch(Exception e) {
			e.printStackTrace();
		//throw new Exception("Invalid Customer");
		}
		return customer;
	}

	public void signUp(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();

	}

	public void updateCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		/*Customer cus=(Customer)session.get(Customer.class, id);
		cus.setPhnum(phone);*/
		session.update(customer);
		tr.commit();
		session.close();
	}

	public void changePassword(String pass,String email) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Customer cus=(Customer)session.get(Customer.class,
				email);
		cus.setCpass(pass);
		session.update(cus);
		tr.commit();
		session.close();
	}

	public void deleteCustomer(int custid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Customer cus=(Customer)session.get(Customer.class, custid);
		session.delete(cus);
		tr.commit();
		session.close();
	}

	public List<Customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Customer> customers=
		session.createCriteria(Customer.class).list();
		tr.commit();
		return customers;
	}

	public Customer getById(int custid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Customer cus=(Customer)session.get(Customer.class, custid);
		tr.commit();
		return cus;
	}

}
