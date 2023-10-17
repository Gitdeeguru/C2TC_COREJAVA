package com.cg.stringoperation;
//if intervier ask you what category string packaga comes under, then you have to say java.lang
public class StringOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("    Hello  ");
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s1.substring(2,5));
		System.out.println(s1.substring(2,3));
		System.out.println(s1.trim());
//		System.out.println(s1.strip());
//		System.out.println(s1.isEmpty());
		
		
//		char c[] = {'I','n','d','i','a','n'};
//		String s3 = new String(c);
//		System.out.println(s3);
	}

}
