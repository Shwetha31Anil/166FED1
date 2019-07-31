package com.mphasis.training.dao;

import java.util.List;

import com.mphasis.training.entities.Customer;

public interface CustomerDao {
	
	public Customer login(String email,String pass)throws Exception;
	public void signUp(Customer customer);
	public void updateCustomer(Customer customer);
	public void changePassword(String pass,String email);
	public void deleteCustomer(int custid);
	public List<Customer> getAllCustomers();
	public Customer getById(int custid);
	
	

}
