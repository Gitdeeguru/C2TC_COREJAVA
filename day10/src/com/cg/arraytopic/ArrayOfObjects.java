package com.cg.arraytopic;

public class ArrayOfObjects {
	public static void main(String[] args) {
	
//		int arr[] = new int[2];
//		arr[0] = 1;
//		arr[0] = 2;
//		
//		
//		
//		//Array of objects
		Student a[] = new Student[5];
		a[0] = new Student(1,"Deepak");
		a[1] = new Student(2,"mohan");
		a[2] = new Student(3,"sanju");
////		a[3] = new Student(4,"freak");
////		a[5] = new Student(4,"freak");
		
		
		
		Student s1 =  new Student();
		s1.setRollno(10);
		s1.setName("deepak");
		
		
		
		System.out.println(s1.getRollno());
		System.out.print(s1.getName());
	}
}