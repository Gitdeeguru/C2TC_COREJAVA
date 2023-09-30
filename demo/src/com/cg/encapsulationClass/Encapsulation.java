package com.cg.encapsulationClass;
//Encapsulation program
public class Encapsulation {
	//variable - data member
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//method - method 
	void display() {
		System.out.println(id +" "+ name);
	}


	@Override
	public String toString() {
		return "Encapsulation [id=" + id + ", name=" + name + "]";
	}
	
	

}
