import java.util.Scanner;
public class EmployeeApp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter adar num and name");
Person p1=new Person(sc.nextLong(),sc.next());
p1.getPersonDetails();

System.out.print("enter employee details \n 1.Adarnum \n 2. name \n 3. Id \n 4. salary \n 5.project");
Employee e1=new Employee(sc.nextLong(),sc.next(), sc.nextInt(),sc.nextDouble(),sc.next());
e1.getEmployeeDetails();
}
}