package com.graymatter;

public class ScientificCalculator extends ArithmeticCalculator{

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(a, b));
	}

	@Override
	public void sqrt(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
	}

}
