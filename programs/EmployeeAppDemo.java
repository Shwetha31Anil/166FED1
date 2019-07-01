Employee ---int id,String name,Salary salary, Address address

class Salary{
	double net_sal, hra,ta,da,pf,gt;
Salary(double net_sal,double hra,double ta,double da,double pf,double gt){}
}

class Address{
    String doornum,street,city,pincode,state;
}


class Employee{
int id;
String name;
Salary salary;
Address address;
Employee(int id,String name,Salary salary,
Address address){
this.id=id;
this.name=name;
this.salary=salary;
this.address=address;
}

}

public class EmployeeAppDemo{
public static void main(String args[]){
Salary salary=new Salary();
Address adress=new Address();
   Employee e1=new Employee(12,"Bhuma",salary,address);
}
}