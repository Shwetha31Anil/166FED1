package com.mphasis.training.testcases;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mphasis.training.assignment.EmployeeEmail;

public class EmployeeEMailTest {

	  @Test
	    public void testValidEmailId() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        boolean result = empEmail.isValidEmailId("andy@testdomain.com");
	        assertTrue("Valid email ID failed ", result );
	        assertTrue(empEmail.isValidEmailId("guptha.shwetha@gmail.com"));
	        assertTrue(empEmail.isValidEmailId("gu67shwetha@testdomain.co.in"));   
	    }

	    @Test
	    public void testInvalidEmailId() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        boolean result= empEmail.isValidEmailId("andy@testdomain");
	        assertFalse("Invalid email ID passed ", result);
	        assertFalse(empEmail.isValidEmailId("@gmail.com"));
	        assertFalse(empEmail.isValidEmailId("gmail.com"));
	        assertFalse(empEmail.isValidEmailId("shwethagmail.com"));
	    }

	    @Test
	    public void testAddEmailId() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");  
	        int size=empEmail.hashMap.size();
	        assertEquals("Incorrect collection size ", 2, size);
	    }

	    @Test

	    public void testAddEmailIdWithDuplicateKey() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "henry@testdomain.com");
	        int size=empEmail.hashMap.size();
	        assertNotEquals("Duplicate key in collection ", 3, size);
	    }

	    @Test
	    public void testGetExistingEmailId() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        String val = empEmail.getEmployeeEmailId("Emp02");
	        assertNotNull("Returned null for existing employee", val);
	    }

	    @Test
	    public void testGetNonExistingEmailId() throws Exception {
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        String val = empEmail.getEmployeeEmailId("Emp05");
	        assertNull("Failed to return null for non existing employee", val);
	    }

	    @Test
	    public void testIfObjectsAreSame() throws Exception {
	        EmployeeEmail empEmail1=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        EmployeeEmail empEmail2=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        empEmail1.addEmployeeEmailId("Emp03", "mary@testdomain.com");
	        Map map1=empEmail1.hashMap;
	        Map map2=empEmail2.hashMap;
	        map1= map2;
	        assertSame("Failed because objects are not same ", map1, map2);
	    }

	    @Test
	    public void testIfObjectsAreNotSame() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail1=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        EmployeeEmail empEmail2=new EmployeeEmail();
	        empEmail2.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        Map map1=empEmail1.hashMap;
	        Map map2=empEmail2.hashMap;
	        assertNotSame("Failed because objects are same ", map1, map2);
	    }
}
