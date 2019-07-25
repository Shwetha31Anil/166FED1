package com.mphasis.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mphasis.training.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e1=new Employee();
        e1.setEmpid(102);
        e1.setEmpName("Boomika");
        e1.setSalary(123456);
       //Employee e1=null; 
   Configuration con=new Configuration()
        .configure().addAnnotatedClass(Employee.class);
        SessionFactory sFactory=con.buildSessionFactory();
        Session session=sFactory.openSession();
        Transaction tr=session.beginTransaction();
      	session.save(e1);//inserting
        e1=(Employee) session.get(Employee.class,101);
      System.out.println(e1);
        e1=(Employee) session.get(Employee.class, 102);
        e1.setEmpName("Neeraja pa");
        e1.setSalary(312345);
        session.update(e1);  
        System.out.println(e1);
        //session.delete(e1);
        System.out.println("listing");
        List<Employee> employees=
        		session.createCriteria(Employee.class)
        		.list();
        employees.forEach((e)->System.out.println(e));
        tr.commit();
        session.close();
        System.out.println("done");
        
        
        
    }
}
