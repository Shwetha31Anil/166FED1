package com.mphasis.training;

import java.util.Scanner;

import com.mphasis.training.beans.Department;
import com.mphasis.training.beans.Employee;
import com.mphasis.training.daos.DepartmentDao;
import com.mphasis.training.daos.DepartmentDaoImpl;
import com.mphasis.training.daos.EmployeeDao;
import com.mphasis.training.daos.EmployeeDaoImpl;

public class AssignmentApplication {

	public static void main(String[] args) {
		
		System.out.println("1. Add Employee ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		DepartmentDao deptdao=new DepartmentDaoImpl();
		switch(choice) {
		case 1: System.out.println("enter employee details");
		Employee e=new Employee();
		e.setEmpid(sc.nextInt());
		e.setEmpName(sc.next());
		e.setSalary(sc.nextInt());
		Department d=deptdao.getDepartmentById(sc.nextInt());
		System.out.println(d.getDeptid()+" "+d.getDname());
		e.setDepartment(d);
		employeeDao.addEmployee(e);
		break;
		default:System.out.println("invalid");
		}
	}

}
