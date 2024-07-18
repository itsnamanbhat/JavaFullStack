package com.graymatter;

public class DemoOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		System.out.println(str.hashCode());
		String s1= "Hello ";
		System.out.println(str.hashCode());
		String s2= new String("hello");
		System.out.println(s2.hashCode());
		System.out.println(s2.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.concat(str));
		System.out.println(s2.equals(str));
		//length calculates number of spaces
		System.out.println(s1.trim()); // left trim and right trim
		System.out.println(str.length());
		System.out.println(s1.substring(0,1));
		System.out.println(s1.replace('H','t'));
		//compare to - negative number results that first string is first and second will be later
		//positive - second comes first in dictionary order and first comes later in dictionary
		System.out.println(s1.endsWith(s2));
		
		// " " -> isEmpty
		// null -> isBlanck
		
		
		
		// string buffer
		
		StringBuffer sbf= new StringBuffer("hello");
		System.out.println(sbf.hashCode());
		sbf.append("Naman");
		System.out.println(sbf.hashCode());
		
		// if application contains modification of data then we should go to string buffer
		//if all modification is done and final string is used then use string ticket
		
		//take an array of names and print all the names which start with s;;
		
		String str1[]= new String [3];
		str1[0]="naman";
		str1[1]="shashwath";
		str1[2]="shamaa";
		for(String i:str1) {
			if(i.startsWith("s")) {
				System.out.println(i);
			}
		}
	}

}
