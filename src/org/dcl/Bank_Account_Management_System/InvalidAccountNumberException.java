package org.dcl.Bank_Account_Management_System;

public class InvalidAccountNumberException extends Exception{
	private String message;

	public InvalidAccountNumberException(String message) {
	
		this.message = message;
	}

	@Override 
	public String getMessage() {
		return message;
	}
	
	
	

}
