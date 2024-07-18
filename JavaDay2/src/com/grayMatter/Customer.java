package com.grayMatter;

import java.util.Date;

public class Customer extends Person{
	private double ordersum;
	private int orderId;
	public Customer() {
		super();
	}
	
	public Customer(String name, int id, String mobile, String email, Date dob, double ordersum, int orderId) {
		super(name, id, mobile, email, dob);
		this.ordersum = ordersum;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Customer [ordersum=" + ordersum + ", orderId=" + orderId + ", toString()=" + super.toString() + "]";
	}
	
}
