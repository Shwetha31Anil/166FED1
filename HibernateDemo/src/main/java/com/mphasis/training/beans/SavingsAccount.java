package com.mphasis.training.beans;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SAVING_ACC")
public class SavingsAccount extends Account {

	private double balance;
	private Date acc_date;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getAcc_date() {
		return acc_date;
	}
	public void setAcc_date(Date acc_date) {
		this.acc_date = acc_date;
	}
	
	
	
}
