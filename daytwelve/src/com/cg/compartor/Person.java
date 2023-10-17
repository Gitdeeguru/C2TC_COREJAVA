package com.cg.compartor;

import java.util.Comparator;

public class Person{
	private String name;
	private int age;
	private String City;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, int age, String City) {
		super();
		this.name = name;
		this.age = age;
		this.City=City;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", City=" + City + "]";
	}
	
	
	static class SortByName implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			return p1.getName().compareTo(p2.getName());
		}
		
	}
	
//	class SortByAge implements Comparator<Person>{  //error its not working on Integer age but its working on string
//
//		@Override
//		public String compare(Person o1, Person o2) {
//			return (String) (o1.getAge().compareTo(o2.getAge()));
//		}
//		
//	}
}
