package com.grayMatter.BankApp;

public class SavingAccount extends Account {
	private double balance;
	
	
	
	public SavingAccount() {
		super();
	}

	

	public SavingAccount(String accNo, String accName, int pin, String bankName, String ifscCode, double balance) {
		super(accNo, accName, pin, bankName, ifscCode);
		this.balance = balance;
	}



	@Override
	
	public void withDraw(double amount) {
		 if(amount>balance)
			   System.out.println("Insufficient Balance");
		   else {
			   balance=balance-amount;
			   System.out.println("Successfully withdrawn "+amount);
		   }
	}
	 public void getBalance()
	   {
		   System.out.println(balance);
	   }
}
