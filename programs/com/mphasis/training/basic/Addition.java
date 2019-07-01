package com.mphasis.training.basic;
import java.util.Scanner;
class Addition{
int add(int num1,int num2){
	return num1+num2;
}
double div(int num1,int num2){return num1/num2;}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.print("Sum of two values "+add(53,545));
System.out.print("Sum of two values "+add(23,55));
}
}
