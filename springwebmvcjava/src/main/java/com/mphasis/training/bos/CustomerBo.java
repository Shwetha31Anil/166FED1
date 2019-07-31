package com.mphasis.training.bos;

import java.util.List;

import com.mphasis.training.entities.Customer;

public interface CustomerBo {
	public Customer login(String email,String pass)throws Exception;
	public void signUp(Customer customer);
	public void editCustomer(Customer customer);
	public void chagePassword(String pass,String email);
	public void removeCustomer(int custid);
	public List<Customer> getAllCustomers();
	public Customer getById(int custid);
}
