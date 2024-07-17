package com.grayMatter;

public class StudentDriver {

	public static void main(String[] args) {
		Student st1= new Student();
	   
	   st1.setStdName("Naman");
	   st1.setId(195);
	   st1.setM1(32);
	   st1.setM2(15);
	   st1.setM3(24);
	   System.out.println(st1);
	   System.out.println("using getters");
	   System.out.println(st1.getStdName());
	   //it can be done for all other parameters
	   
	   
	   // using constructors
	   
	   Student st2= new Student ("Naman",231,352,523,52);
	   System.out.println(st2);
	}

}
