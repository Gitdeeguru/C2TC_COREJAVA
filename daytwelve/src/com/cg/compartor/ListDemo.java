package com.cg.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cg.compartor.Person.SortByName;

public class ListDemo {

	public static void main(String[] args) {
//		List<Student> studentList = new ArrayList<Student>();
//		studentList.add(new Student("Deepak",34,75));
//		studentList.add(new Student("mohan",24,69));
//		studentList.add(new Student("Sandro",33,67));
//		System.out.println("--------Before Sorting--------");
//		System.out.println(studentList);
//		Collections.sort(studentList);
//		System.out.println("--------After Sorting--------");
//		System.out.println(studentList);
		
	System.out.println("---------------------------------------------");	
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Deepak",34,"Bangalore"));
		personList.add(new Person("mohan",24,"Mangalore"));
		personList.add(new Person("Sandro",33,"Delhi"));
		System.out.println("--------Before Sorting--------");
		System.out.println(personList);
		Collections.sort(personList, new SortByName());
		System.out.println("--------After Sorting--------");
		System.out.println(personList);
	}

}
