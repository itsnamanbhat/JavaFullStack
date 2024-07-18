package com.grayMatter;

// static methods are class methods which helps us not to create objects
public class DemoOnStatic {
	static String name;
	public void sayHello() {	// static methods are class level methods
		System.out.println("hello");
		
	}
	public static void main(String args[]) {//only main method which is static and with argument is considered by the jvm and treated as entry point
		main();
	}
	
	public static void main() {
		System.out.println("static main without argument");
	}
}

//static method always uses static properties
