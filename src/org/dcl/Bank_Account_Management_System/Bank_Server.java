package org.dcl.Bank_Account_Management_System;

import java.util.ArrayList;

public class Bank_Server {
	ArrayList<Bank_Account> account=new ArrayList<>();
	
	void accountCreate(Bank_Account accno) {
		account.add(accno);
		System.out.println("account is created sucsefully");
	}
	 
		Bank_Account findAccount(int accountno) {
		for(Bank_Account no:account) {
			if(no.getAccountId()== accountno) {
//				Bank_Account id=no.getAccountId();
				System.out.println(no.getAccountId());
				return no;
			}	
		}
		return null;
	}
}
