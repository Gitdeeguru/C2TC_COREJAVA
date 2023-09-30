package com.cg.abstractclass;

public abstract class Notes {

	//Constructor
	public Notes() {
		
	}
	
	//non abstract method
	void display() {
		System.out.println("Display method");
	}
	
	abstract void show(); //abstract method
	
	//Abstract class
	//1. abstract keyword
	//2. variables + methods
	//3. method - Abstract method and Non-abstract method
	//4. if abstract method is present in a class, it is mandatory to make the class as abstract 
	//5. Cannot instantiate abstract class
}
