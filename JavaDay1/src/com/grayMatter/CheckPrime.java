package com.grayMatter;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		int i=2;
//		boolean flag=true;
//		while(i<Math.sqrt(num)) {
//			if(num%i==0) {
//			flag=false;
//			break;
//			}
//			i++;
//		}
//		if(flag) {
//			System.out.println("Its is prime number");
//			
//		}
		
		
//		//multiplication table
//		System.out.println("Enter a number");
//		int m= sc.nextInt();
//		for(int i=1;i<=10;i++) {
//			System.out.println(m*i);
//			
//		}
		
		for(int i=1;i<=50;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}

}
