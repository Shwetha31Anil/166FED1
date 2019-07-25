package com.mphasis.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.mphasis.training.beans.Department;
import com.mphasis.training.beans.Employee;
import com.mphasis.training.conf.HibernateUtil;

public class EmployeeApp {

	public static void main(String[] args) {
		/*Department d1=new Department();
		d1.setDeptid(23);
		d1.setDname("Sales");
		
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setEmpName("Neeraja");
		e1.setSalary(65673);
		e1.setDepartment(d1);
		
		Employee e2=new Employee();
		e2.setEmpid(102);
		e2.setEmpName("Priya");
		e2.setSalary(65693);
		e2.setDepartment(d1);
		*/
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//Hibernate methods
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary", 50000));
		List<Employee> results2=cr.list();
		results2.forEach((e1)->System.out.println(e1));
		//HQL
		Query q=session.createQuery(
				"from Employee where salary > 50000");
		List results=q.list();
		results.forEach((e1)->System.out.println(e1));
		//SQL
		SQLQuery q1=session.createSQLQuery("select * from mphemployee where salary>50000");
		q1.addEntity(Employee.class);
		List results1=q1.list();
		results1.forEach((e1)->System.out.println(e1));
		/*session.save(d1);
		session.save(e1);
		session.save(e2);*/
		
	/*	Department d12=(Department)session.get(Department.class, 23);
		System.out.println(d12);
	*/	tr.commit();
		
		session.close();
		

	}

}
