import java.util.Scanner;
//custom exception
class InsuffientFunds extends Exception{
	InsuffientFunds(String message){
	super(message);
	}
}

abstract class Account{
private String acc_holder_name;
private long acc_num;
protected double balance;
Account(String acc_holder_name,long acc_num,double balance){
this.acc_holder_name=acc_holder_name;
this.acc_num=acc_num;
this.balance=balance;
}

public double getBalance(){
return balance;
}
 public abstract double withdraw(int amount)throws InsuffientFunds;
public double deposit(double amount)throws InsuffientFunds{
 	if((amount%100)==0)
	   balance+=amount;
	else
	   throw new InsuffientFunds("problem with deposit");
	return balance;
}

}

class SavingsAccount extends Account{
       SavingsAccount(String acc_holder,long acc_num,double balance){
	super(acc_holder,acc_num,balance);
       }
  public double withdraw(int amount)throws InsuffientFunds{
      if((this.balance-amount)>=1000)
     
	balance=balance-amount;
      else 
           throw new InsuffientFunds("insuffient balance");
   return balance;
 }
}

class CurrentAccount extends Account{
       CurrentAccount(String acc_holder,long acc_num,double balance){
	super(acc_holder,acc_num,balance);
       }
  public double withdraw(int amount)throws InsuffientFunds{
      if(this.balance >= (amount-10000))
	balance=balance-amount;
      else 
            throw new InsuffientFunds("insuffient balance");
   return balance;
 }
}

public class BankAppAbstractDemo{
   public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Bank. \n select Account type \n 1. Savings 2.Current");
  int choice=sc.nextInt();
   if(choice==1){
System.out.println("1. Account HolderName \n 2. Account number 3.Balance");
      Account s1=new SavingsAccount(sc.next(),sc.nextLong(),sc.nextDouble());
do{
System.out.println("Account createed with balance "+s1.getBalance()+"\n 1. Withdraw 2.deposit 3.Logout");

    int op=sc.nextInt();
     switch(op){
       case 1: System.out.println("enter the amount to withdraw");
try{
System.out.println(s1.withdraw(sc.nextInt()));
}catch(InsuffientFunds e){
System.out.print(e.getMessage());
}
	break;
     case 2: System.out.println("enter the amount to deposit");
try{
System.out.println(s1.deposit(sc.nextDouble()));
}catch(InsuffientFunds e){
System.out.print(e.getMessage());
}
break;
 case 3: System.exit(0);
default:System.out.println("invalid operation");
    }
}while(true);
   }else if(choice==2){
   }else{
	System.out.print("invalid account type");
   }	

   }
}