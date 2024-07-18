package com.graymatter.bank;

public class Account {
	private String accNo;
	private String accHolderName;
	private int pin;
	private String bankName;
	private String ifscCode;
	public Account() {
		super();
	}
	public Account(String accNo, String accHolderName,int pin, String bankName, String ifscCode) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.pin=pin;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName=" + bankName + ", ifscCode="
				+ ifscCode + "]";
	}
	
public void withdraw(double amount) {
		System.out.println("Amount Withdrawn Successfully");
	}
	
	public void changePin(int currPin,int newPin) {
		if(this.pin==currPin)
			this.pin=newPin;
		else
			System.out.println("Pin number is not matching");
			
	}

}
