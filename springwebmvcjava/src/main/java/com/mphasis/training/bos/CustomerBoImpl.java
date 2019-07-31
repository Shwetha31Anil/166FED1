package com.mphasis.training.bos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.training.dao.CustomerDao;
import com.mphasis.training.entities.Customer;

@Service
public class CustomerBoImpl implements CustomerBo {
	
	@Autowired
	CustomerDao customerDao;

	public Customer login(String email, String pass) throws Exception {
		Customer customer=null;
		if(email.matches("([a-zA-Z/.&%-_]{10,})@gmail.com")
					&& pass.matches("[a-zA-Z]{8,}")) 
			customer=customerDao.login(email, pass);
		else
			throw new Exception("invalid pattern");
		return customer;
	}

	public void signUp(Customer customer) {
		customerDao.signUp(customer);
	}

	public void editCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
	}

	public void chagePassword(String pass,String email) {
		// TODO Auto-generated method stub
customerDao.changePassword(pass, email);
	}

	public void removeCustomer(int custid) {
		customerDao.deleteCustomer(custid);

	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	public Customer getById(int custid) {
		// TODO Auto-generated method stub
		return customerDao.getById(custid);
	}

}
