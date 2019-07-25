package com.mphasis.training.daos;

import java.util.List;

import com.mphasis.training.beans.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int eid);
	public Employee getEMployeeById(int eid);
	public List<Employee>  getAll();
	public List<Employee>  getEmployeesByName(String name);
	public List<Employee>  getEMployeeBySal(int sal);
	

}
