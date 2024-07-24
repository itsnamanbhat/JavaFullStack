package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//create a person class with the properties name, age,city ,aadhar 
//and create a hashset of n number of persons and check for whether person is eligble to caste the vote, or throw 
//Agenotsufficient exception using streams


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class Person {
	private String name;
	private int age;
	private String city;
	private long aadhar;
}


