package com.grayMatter;

import java.util.Scanner;

public class DemoOnSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		char op;
		System.out.println("enter an operator");
		op=sc.next().charAt(0);
		switch(op){
			case'+': System.out.println(a+b);
			break;
			case'-':System.out.println(a-b);
		}
		

	}

}
