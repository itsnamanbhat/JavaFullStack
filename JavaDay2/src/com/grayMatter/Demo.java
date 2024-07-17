package com.grayMatter;

public class Demo {
		public String Name;//package level
		public class InnerClass{
			private String innerCalssName;
		}
}


//in real scenarios, make the properties private always which can be used using public classes/ or public method
// if the constructor is private, we cannot use new keyword