package com.cg.statickayword;

public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Deepak",01);
		System.out.println(s1);
		
		System.out.println("----After MOdiication----");
		s1.modify();  //!st method of calling
		Student.modify(); //2nd method of calling
		System.out.println(s1);
	}

}
