public class Employee extends Person{
private int empid;
private double salary;
private String project;
public Employee(long adarNum,String name,int empid,double sal,String pro){
super(adarNum,name);
this.empid=empid;
this.salary=sal;
this.project=pro;
}

public void getEmployeeDetails(){
super.getPersonDetails();
	System.out.print("Employee Details");
System.out.print( empid+ " "+salary+" "+project );
}
}