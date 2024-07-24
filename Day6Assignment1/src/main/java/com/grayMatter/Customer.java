package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
	private int custId;
	private String name;
	private boolean freeDelivery;
	private double orderValue;
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Customer e=new Customer();
		e=(Customer)o;
		
		//return this.getId()-e.getId();
		//return this.getName().compareTo(e.getName());
		return (int) (this.getOrderValue()-e.getOrderValue());
		
	}
	@Override
	public boolean equals(Object obj) {
		Customer c=(Customer)obj;
		if((this.getCustId()==c.getCustId())&&( this.getName().equals(c.getName()))&&(this.getOrderValue()==c.getOrderValue())) {
			return true;
		}
		return false;
	}
}
