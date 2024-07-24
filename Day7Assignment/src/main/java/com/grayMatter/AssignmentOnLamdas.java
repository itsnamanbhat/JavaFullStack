package com.grayMatter;
		
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;


public class AssignmentOnLamdas {
	
	// finding prime numbers
	
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        }
	
	
	public static void  main(String args[]) {
	
	//1-write a program to implement a lambda expression to sort a list of strings in alphabetical order
	List<String> slist= new ArrayList<>();
	slist.add("anil");
	slist.add("thanish");
	slist.add("manish");
	slist.add("giri");
	
	slist.stream().sorted().forEach(i->System.out.println(i));
	
	//2-write a lambda exp to find average of list of doubles

	ArrayList<Double> darr= new ArrayList<>();
	darr.add(32.1);
	darr.add(134.4);
	darr.add(132.11);
	OptionalDouble ans=darr.stream().mapToDouble(Double::doubleValue).average();
	System.out.println(ans);
	
	//3-write a lamda exp to check if a number is prime or not
	
		LinkedList <Integer> narr= new LinkedList<>();
		narr.add(7);
		narr.add(32);
		narr.add(31);
		narr.add(56);
		
		List <Integer> primeNumbers=narr.stream().filter(AssignmentOnLamdas::isPrime).toList();
		System.out.println(primeNumbers);
		
	//4-write a lambda exp to count number of words in paragraph
		
		String myParagraph = "Hey this is the only paragraph which helps me to calculate the number of words in a paragraph";
		
		List <String> word= Arrays.asList(myParagraph.split("\\s+"));
		long wordCount=word.stream().filter(word1 ->!word1.isEmpty()).count();
		
		System.out.println("Total number of words are "+wordCount);

	}	
}
