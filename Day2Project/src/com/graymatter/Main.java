package com.graymatter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Employee emp=new Employee();
		System.out.println(emp);
		
		Employee e2=new Employee("Harsha",21,"123456789","hp@gmail.com",new Date("16/7/2024"),"accounts",50000,new Date("23/7/2024"));
		System.out.println(e2);
		
		System.out.println(e2 instanceof Person);
		
		
		Customer cus=new Customer("Harsha", 117,"8749047265", "hp@gmail.com", new Date("08/09/2024"), 5000.0, 100);
		System.out.println(cus);
		
		System.out.println();
		
		
	     
	    
	
	}


}
