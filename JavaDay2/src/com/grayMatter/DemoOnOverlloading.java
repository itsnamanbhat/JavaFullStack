package com.grayMatter;

public class DemoOnOverlloading {
	public void add(int a, int b) {
		System.out.println(a+b);
	
	}
	public void add (float f1,float f2) {
		System.out.println(f1+f2);
	}
	public void add (String s1, String s2) {
		System.out.println(s1+s2);
	}
	//change in number of parameters
	
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	
	public void add (double d1,double d2, double d3, double d4) {
		System.out.println(d1+d2);
		
	}
	
	// change in order of parameters
	
	public void add (int a ,double d) {
		System.out.println(a+d);
		
	}
	
	public void add(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.img= c1.img+c2.img;
		c3.real= c1.real+c2.real;
		System.out.println(c3.real+"+"+c3.img);
		
	}
	public static void main(String[] args) {
		DemoOnOverlloading doo = new DemoOnOverlloading();
		doo.add(34, 35);
		doo.add(4.3f, 5.6f);
		doo.add(3.2,5.3,5.3,3.4);
		Complex c1= new Complex(4,4);
		Complex c2=new Complex(3,1);
		doo.add(c1, c2);
		
		}
	}


