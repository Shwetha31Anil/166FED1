import java.util.Scanner;
class Demo{
public static void main(String args[]){
    System.out.println("Welcome");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num to check even or odd");
int num1=sc.nextInt();
if((num1%2)==0)
System.out.println("Even number");
else
System.out.println("odd number");
}
}