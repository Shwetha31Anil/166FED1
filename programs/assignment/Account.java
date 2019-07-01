package assignment;

public  class Account {
	private long acc_num;
	private String acc_holder_name;
	protected double balance;
	private String acc_created_date;
	public Account(long acc_num, String acc_holder_name, double balance, String acc_created_date) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
		this.acc_created_date = acc_created_date;
	}
	public double getBalance() {
		return balance;
	}
	
	public double withdraw(int amount) {
		if(this.balance >= (amount+1000) )
		{
			balance=balance-amount;
			
		}else if(this.balance==amount) {
			System.out.println("minimum balance 1000");
			
		}
		else {
			System.out.println("insuffienct balance");
			
		}
		return balance;
		
	}
	public double deposit(int amount) {
		if((amount%100)==0) {
		balance=balance+amount;
		}else {
			System.out.println("only multiples of 100 can deposit");
		}
		return balance;
		
	}

}
