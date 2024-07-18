package com.grayMatter.BankApp;

public class Account {
	private String accNo;
	private String accName;
	private int pin;
	private String bankName;
	private String ifscCode;
	public Account() {
		super();
	}
	public Account(String accNo, String accName, int pin, String bankName, String ifscCode) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.pin = pin;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", pin=" + pin + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + "]";
	}
	
	public void ChangePin(int currPin,int newPin) {
		if(this.pin==currPin)
			this.pin= newPin;
		else
			System.out.println("Pin number is not matcing");
	}
	public void withDraw(double amount) {
		System.out.println("The cash has been withdrawn successfully");
	}
}
