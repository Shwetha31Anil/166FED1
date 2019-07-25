package com.mphasis.training.daos;

import java.util.List;

import com.mphasis.training.beans.Department;

public interface DepartmentDao {
	
	public void addDepartment(Department d);
	public void updatedepartment(Department d);
	public void deletDepartment(int did);
	public Department getDepartmentById(int did);
	public List<Department> getAll();
	
	

}
