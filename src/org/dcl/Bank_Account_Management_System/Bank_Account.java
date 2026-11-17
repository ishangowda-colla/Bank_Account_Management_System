package org.dcl.Bank_Account_Management_System;

public class Bank_Account {
	private int accountId;
	private String accountName;
	private double balance;
	public Bank_Account(int accountId, String accountName,double balance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance=balance;
	}
	
	public int getAccountId() {
		return accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	void deposite(int amount) {
		this.balance+=amount;
		System.out.println("Deposite amount is "+ amount);
	}
	
	void withdraw(int withdrawAmount) {
		if(withdrawAmount>=balance) {
			this.balance-=withdrawAmount;
		}
		else {
			System.out.println("insufficent amount");
		}
	}
	double getBlance() {
		return balance;
	}
	void display() {
		System.out.println("Account id "+ accountId);
		System.out.println("Account name "+ accountName);
		System.out.println("Blance "+ balance);
	}
	

}
