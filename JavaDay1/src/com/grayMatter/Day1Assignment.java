package com.grayMatter;

import java.util.Scanner;

public class Day1Assignment {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
//		int a= sc.nextInt()	;
//		int b=sc.nextInt()	;
//		int c=sc.nextInt()	;
//		int d=sc.nextInt()	;
//		int e= sc.nextInt();
		
// Assignment 1--      max of 4 numbers using ternary operator
//		System.out.println("Enter 4 numbers");
		
		
//		int max= (a>b && a>c && a>d)?a:((b>c && b>d)?b:(c>d?c:d));
//		System.out.println(max);
		
//Assignment 2--      maximum of 5 numbers using ternary operator

//		int max= (a>b && a>c && a>d&& a>e)?a:((b>c && b>d && b>e)?b:(c>d && c>e)?c:(d>e?d:e));
//		System.out.println(max);
		
		
//Assignment 3--		maximum of 4 numbers using if else statement
//		int max = 0;
//		if(a>b) {
//			if(a>c) {
//				if(a>d)
//					max=a;		
//			}
//		}else if(b>c) {
//		if(b>d)
//			max=b;
//		
//	}else if(c>d)
//		max=c;
//	else
//		max=d;
//		
//		System.out.println("The maximum of 4 numbers is "+ max);
		
//Assignment 4--		maximum of 5 numbers using if else statement
//		int max = 0;
//		if(a>b) {
//			if(a>c) {
//				if(a>d) {
//					if(a>e)
//						max=a;
//				}
//			}				
//		}else if(b>c) {
//		if(b>d) {
//			if(b>e)
//			max=b;
//		}
//	}else if(c>d) {
//		if(c>e)
//		max=c;
//	}
//	else if(d>e)
//		max=d;
//	else
//		max=e;
//		
//		System.out.println("The maximum of 5 numbers is "+ max);
		
	
		
//Assignment 5-- 		creating a student report card
Student std= new Student("Naman Bhat",432,65,77,98)
		
		
//Assignment 6--		Creating the words for numbers zero to nine
		System.out.println("Enter digit between 0-9");
		int val= sc.nextInt();
		String ans="";
		
		switch(val) {
		
		case 0: ans="zero";
		break;
		
		case 1: ans="one";
		break;
		
		case 2: ans="two";
		break;
		
		case 3: ans="Three";
		break;
		
		case 4: ans="Four";
		break;
		
		case 5: ans="five";
		break;
		
		case 6: ans="six";
		break;
		
		case 7: ans="seven";
		break;
		
		case 8: ans="eight";
		break;
		
		case 9: ans="nine";
		break;
		
		default: ans= "invalid digit";
		}
		System.out.println(ans);
	}
}
