package com.cg.stringoperation;

public class StringBufferExample {
	public static void main(String[] args) {
		
//		StringBuffer s1 = new StringBuffer();
//		System.out.println(s1.capacity());//default capacity -- 16
		
		StringBuffer s2 = new StringBuffer("Hello"); 
//		System.out.println(s2.length());
		System.out.println(s2.capacity());//16 + 5 = 21
		s2.append("I am good");
		System.out.println(s2.capacity()); //5 + 9 = 14 still ramains same 21 capacity
//		
		s2.append("I am fine"); // 5 + 9 + 9 = 23 it exceeds so capacity will be changed to 21 * 2 + 2 = 44 capacity  
		System.out.println(s2.capacity());
		s2.append("tell me");  //current capacity is 44 then 5 + 9 + 9 + 7 =30 still 44 remains same
		System.out.println(s2.capacity()); 
//		
		s2.ensureCapacity(40);
		System.out.println(s2.capacity());
		
		
		
//		StringBuffer s2 = new StringBuffer();
//		System.out.println(s2.length());
//		System.out.println(s2.capacity());//default capacity -- 16
//		s2.append("How are you");
//		System.out.println(s2.capacity());
		
		
		
	}
}
