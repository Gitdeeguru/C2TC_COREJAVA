package com.cg.statickayword;

public class Student {
	private String name;
	private int id;
	private static String collageName = "GAT";
	
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	//non-static method
	  static void modify() {
		
		collageName = "Global Academy of Technology";
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", collageName=" + collageName + "]";
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Deepak",01);
		System.out.println(s1);
		
		System.out.println("----After MOdiication----");
		modify();
		System.out.println(s1); //3rd method of accessing or calling
}
}


