package com.grayMatter;

import java.util.Scanner;

public class Employee {

	
//		instance variables
		String name;
		int id;
		double sal;
		double mobile;
		String email;
		
public Employee(String name, int id, double sal, double mobile, String email) {
			super();
			this.name = name;
			this.id = id;
			this.sal = sal;
			this.mobile = mobile;
			this.email = email;
		}
	//		static String CompanyName;//static variables - independent of object / shared variable
    public void setDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee details, name,id,sal,mobile,email");
			this.name=sc.next();
			this.id=sc.nextInt();
			this.sal=sc.nextDouble();
			this.mobile= sc.nextDouble();
			this.email= sc.next();
			
			
		}
    public void getDetails() {
    	System.out.println(this.email+" "+ this.id+" "+ this .sal+" "+this.mobile);
    }
	}


