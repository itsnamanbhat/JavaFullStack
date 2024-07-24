package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Employee {
	private int id;
	private String name;
	private double salary;
	private String city;
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e=(Employee)o;
		
		//return this.getId()-e.getId();
		//return this.getName().compareTo(e.getName());
		return (int) (this.getSalary()-e.getSalary());
	}


	
}
