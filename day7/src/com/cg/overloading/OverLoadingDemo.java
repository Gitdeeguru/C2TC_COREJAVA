package com.cg.overloading;

// over loding--- 
//1.difference in datatype, but same in number of arguments.
//2.same in dataype, difference in number of arguments.
//3.Different in datatypes and arguments
//4/difference in return type alone is not a concept of over loading
				  
public class OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		data d = new data(5);
		data d1 = new data(2.0f, 4.5f);
		data d2 = new data(3.4f, 4.5f, 5.4f);
		System.out.println(d.toString());
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		System.out.println(MethodOverloading.addition(10,20));
		System.out.println(MethodOverloading.addition(10.0f,20.0f));
		System.out.println(MethodOverloading.addition(10.0f,20.0d));
	}

}
