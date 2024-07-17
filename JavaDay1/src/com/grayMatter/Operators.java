package com.grayMatter;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=4;
		int num2=17;
		
		System.out.println("sum="+(num1+num2));
		System.out.println("diff ="+(num2 - num1));
		System.out.println("diff ="+(num2 / num1)); //gives integer value
		System.out.println("diff ="+((float)(num2)/ num1));// this is called typecasting
		
		//ternary operator
		//exp1?exp2:exp3 //immediatly after question mark : true value
		System.out.println(num1>num2?num1:num2);
		
		int a=78,b=515,c=66;
		System.out.println("Max of three numbers:"+((a>b && a>c)?a:(b>c?b:c)));
		//second logic for above question
		int e=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(e);
		//swapping variables without using a temporary variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+" "+ b);
		
//		swapping of 3 numbers
//		a=a+b+c;
//		b=a-b-c;
//		c=a-b-c;
//		a=a-b-c;
		
//		checking if number is even or odd
		System.out.println(a%2==0?"even":"odd");
		
//		bitwise right shift makes number half
//		bitwise lefts shift makes it double
		int num=-60;
		System.out.println(num>>1);
		
	}

}

//assignment - max of 4 numbers and max of 5 numbers using ternary operator

	