package com.grayMatter;

import java.util.Arrays;

public class School {
	private String schoolName;
	private String  address;
	ClassRoom cr[];
	
	
	public School(String schoolName, String address) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		ClassRoom c1= new ClassRoom(3,2);
		ClassRoom c2= new ClassRoom(5,1);
		ClassRoom cr[]= new ClassRoom[2]; // initializing array : int arr[]= new int[size] or directly giving array elements {};
		this.cr = cr;
	}


	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
	}


	public School() {
		super();
	}

}
