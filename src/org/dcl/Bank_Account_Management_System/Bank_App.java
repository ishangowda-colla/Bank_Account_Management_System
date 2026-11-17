package org.dcl.Bank_Account_Management_System;

import java.util.Scanner;



public class Bank_App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank_Server bs = new Bank_Server();
		
		
		while(true)
			{
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.println("-----------------------------");
            
            System.out.println("Enter your choice");
            System.out.println("------------------------------");
            int choice=sc.nextInt();
            if(choice==6) {
            	System.out.println("Exited from bank");
    			break;
    		}
		
		switch(choice) {
			case 1:
				System.out.println("Enter the account number");
				int accno=sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter your Name");
				String name=sc.nextLine();
				

				System.out.println("Enter the initial balance");
				double balance=sc.nextDouble();
				
				bs.accountCreate(new Bank_Account(accno, name, balance));
				break;
				
			case 2:
				
				System.out.println("Enter your account nnumber");
				accno=sc.nextInt();
				
				Bank_Account bc= bs.findAccount(accno);
			
				if(bc!=null) {
					System.out.println("Enter the amount");
					int amount=sc.nextInt();
					bc.deposite(amount);
				}
				else {
					try {
						throw new InvalidAccountNumberException(" Account Number is not existed");
					}
					catch(InvalidAccountNumberException i) {
						System.out.println( i.getMessage());
					}
				}
				break;
				
			case 3:
				System.out.println("Enter the account number");
				accno=sc.nextInt();
				
				bc= bs.findAccount(accno);
				
				if(bc!=null) {
					System.out.println("Enter the amount");
					int amount=sc.nextInt();
					bc.withdraw(amount);
				}
				else {
					try {
						throw new InvalidAccountNumberException(" Account Number is not existed");
					}
					catch(InvalidAccountNumberException i) {
						System.out.println( i.getMessage());
					}
				}
				break;
			case 4:
				System.out.println("Enter the account number");
				accno=sc.nextInt();
				
				bc= bs.findAccount(accno);
				
				if(bc!=null) {
					
					
					double balance1=bc.getBlance();
					System.out.println("Balance"+ balance1);
				}
				else {
					try {
						throw new InvalidAccountNumberException(" Account Number is not existed");
					}
					catch(InvalidAccountNumberException i) {
						System.out.println( i.getMessage());
					}
				}
				break;
			case 5:
				System.out.println("Enter the account number");
				accno=sc.nextInt();
				
				bc= bs.findAccount(accno);
				
				if(bc!=null) {
					bc.display();
				}
				else {
					try {
						throw new InvalidAccountNumberException(" Account Number is not existed");
					}
					catch(InvalidAccountNumberException i) {
						System.out.println( i.getMessage());
					}
				}
				
				break;
			
			default:
					System.out.println("Inavlid choice");
					break;
				
				
				
		}
		
		
			}
		
      
    
	}

}
