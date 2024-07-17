package com.grayMatter;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// max of two numbers
		
//		int a,b;
//		System.out.println("Enter Two numbers");
//		 a= sc.nextInt();
//		 b= sc.nextInt();
//		if(a>b)
//			System.out.println(a);
//		else
//			System.out.println(b);
		
		//check if even or odd
//		System.out.println("Enter a number to check");
//		int a=sc.nextInt();
//		if(a%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//		
//	}
		
//		//max of 3 numbers
//		int a ,b,c;
//		System.out.println("Enter 3 numbers");
//		a=sc.nextInt();
//		b= sc.nextInt();
//		c= sc.nextInt();
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("A is max");
//			}
//			else
//				System.out.println("C is max");
//		}
//		else {
//			if(b>c) {
//				System.out.println("b is max");
//			}
//			else
//				System.out.println("c is max");
//		}
//
//
		
		int a,b;
		char op;
		System.out.println("enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter operator");
		op=sc.next().charAt(0);
		if(op=='+')
			System.out.println(a+b);
		else if(op=='-')
			System.out.println(a-b);
		else if(op=='*')
			System.out.println(a*b);
		else if(op=='/')
			System.out.println((float)a/b);
		else
			System.out.println("invalid operator");
	}
	}	
