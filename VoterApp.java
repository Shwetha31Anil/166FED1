import java.util.Scanner;
class Voter{
 private long adarNum;
 private String name;
private int age;
Voter(long adarNum,String name,int age){
	this.adarNum=adarNum;
	this.name=name;
	this.age=age;
}
public String toString(){
 return "Voter details\n"+ adarNum+"\n"+name+"\n"+age;
}
}
public class VoterApp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your details age");
int age=sc.nextInt();
try{
if(age <18)
 throw new InvalidAgeException("Not eligible for voting");
else{
System.out.println("Enter your details adarNum and name");
Voter v1=new Voter(sc.nextLong(),sc.next(),age);
System.out.print(v1);
}
}catch(InvalidAgeException e){
System.out.println(e.getMessage());
}
System.out.print("Thanks for using VoterApp");
}
}
// Custom Exception class
class InvalidAgeException extends Exception{
InvalidAgeException(String message){
	super(message);
}
}