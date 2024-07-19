package com.graymatter;

public class DemoOnFunctionalInterface implements MyFunctionalInterface {

	@Override
	public int cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}
	
	public static void main(String args[]) {
		DemoOnFunctionalInterface dof = new DemoOnFunctionalInterface();
		System.out.println(dof.cubeOfNum(6));
	}

}
