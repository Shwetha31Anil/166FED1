package assignment;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Mphasis Bank");
		System.out.println("Which account should create");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Savings \n 2. Current");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter the account details\n"
					+ "1.Acc_num \n 2.Name\n 3.balance \n 4.date");
			Account a1=new SavingsAccount(sc.nextLong(),sc.next(),sc.nextDouble(),sc.next());
			System.out.println("account created with the balance "+a1.getBalance());
			do {
			System.out.println("1. Withdraw \n 2. deposit\n 3.exit");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1: System.out.println("enter amount to withdraw");
		  	
			System.out.println(a1.withdraw(sc.nextInt()));
			
			     	break;
			case 2: System.out.println("enter amount to deposit");
	     	
	     		System.out.println(a1.deposit(sc.nextInt()));
	     	
			
	     	break;     	
			case 3: System.exit(0);
			default: System.out.println("invalid case");
			}
			}while(true);
			
		}else if(choice ==2){
			
		}
		else {
			System.out.println("invalid");
		}
	}

}
