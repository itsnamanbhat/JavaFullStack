package com.grayMatter.BankApp;

public class CurrentAccount extends Account {
		private double overDraftLimit;
		
		
		public CurrentAccount(String accNo, String accName, int pin, String bankName, String ifscCode,
				double overDraftLimit) {
			super(accNo, accName, pin, bankName, ifscCode);
			this.overDraftLimit = overDraftLimit;
		}


		public CurrentAccount() {
			super();
		}


		@Override
		public void withDraw(double amount) {
			if(amount>overDraftLimit) {
				System.out.println("Insufficient Overdraft Limit");
			}
			else {
				overDraftLimit=overDraftLimit-amount;
				 System.out.println("Successfully withdrawn "+amount);
			}
		}
		public void getOverDraftLimit() {
			   System.out.println(overDraftLimit);
		   }
		
}
