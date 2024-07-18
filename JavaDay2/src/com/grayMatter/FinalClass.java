package com.grayMatter;

public  class FinalClass { //final classes cannot be extended
	
	private final String name;
	protected String companyName;
	public void changeName(String name) {
//		this.name=name; final properties cannot be reassigned
	}
	public void printCompanyDetails() { // final methods cannot be overridden
		System.out.println(this.companyName);
	}
	public FinalClass(String name) {
		this.name=name;
	}
}
