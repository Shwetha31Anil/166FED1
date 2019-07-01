package assignment;


public class CurrentAccount extends Account {

	public CurrentAccount(long acc_num, String acc_holder_name, double balance, String acc_created_date) {
		super(acc_num, acc_holder_name, balance, acc_created_date);
		
	}
	
	public double withdraw(int amount) {
		if(this.balance >= (amount-10000))
		{
			balance=balance-amount;
			
		}else {
			throw new InsufficientBalance("insuffient balance");
		}
		return balance;
		
	}

}
