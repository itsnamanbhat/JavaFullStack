package com.grayMatter;

import java.util.HashSet;

public class Assignment2 {

	public static void main(String[] args) {
		HashSet <Person> personSet= new HashSet<>();
		personSet.add( new Person("karthik",32,"los angeles",483038331));
		personSet.add( new Person("amarjit",22,"aagra",483998331));
		personSet.add(new Person("adithya",12,"amaravathi",483038331));
		personSet.add(new Person("anirudhh",18,"los angeles",483038331));
		personSet.add(new  Person("akila",11,"los angeles",483038771));
		personSet.add(new Person("bandavya",12,"amaravathi",483228331));
		personSet.add(new Person("parth",02,"los angeles",483037731));
		personSet.add(new Person("pramila",99,"Bengaluru",483023331));
		personSet.add(new Person("dhirubai",8,"bidar",483030631));
		
		 personSet.stream()
         .filter(person -> person.getAge() < 19)
         .findFirst()
         .ifPresent(person -> {
             throw new IllegalArgumentException("This person is not eligible for vote: " + person.getName());
         });
	}

}
