package com.mphasis.cart.dao;

import java.util.List;

import com.mphasis.cart.beans.Product;

public interface ProductDao {
	
	public int addProduct(Product p);
	public int updateProduct(int pid,double cost, int qty);
	public int deleteProduct(int pid);
	public Product getById(int pid);
	public List<Product> getProductByName(String pname);
	public  List<Product> getAll();
	

}
