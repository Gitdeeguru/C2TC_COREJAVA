package com.cg.stringbuiltinfunction;
import java.util.*;
public class stringbuiltin {

	public static void main(String[] args) {
		String s1 = "Hello, welcome to programming world";
		System.out.println(s1.substring(7)); //substring(single index)
		System.out.println(s1.substring(4,9)); //substring(startingindex, endingIndex)
		System.out.println(s1.replace("e","m"));  //replace all the ocurrance of actual word to desire word
		System.out.println(s1.replace("Hello","Hi"));  //another example of replace
		System.out.println(s1.contains("to"));  // return or prints boolean expression if the your desire char or word contains in String object
		String G1 = "MaLe"; //constant variable
		String G2 = "male";//constant variable
		System.out.println(G1.equalsIgnoreCase(G2)); //It only checks charater that are same in both string varibles it doesn't mind about case sensitive
		System.out.println(s1.indexOf("i"));  //it gives you the index value of your given desire char 
		System.out.println(s1.lastIndexOf("w")); //it gives you the index last value which is appering at last 
		System.out.println(s1.length());  //gives you the total length of values which is present
		System.out.println(s1.charAt(3)); //it gives you the char, in which you specified the index value
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(G1 + G2);
		System.out.println(s1.trim()); //removes the blank space from the start and in the end at the same time
		char[] c1 = s1.toCharArray();
		for(int i=0;i<c1.length;i++) {
			System.out.println(c1[i]);
		}
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.endsWith("world"));
		System.out.println(String.format("%f",23.0));
		System.out.println(String.format("%s","Heelo"));
		System.out.println(s1.isEmpty());
		System.out.println(String.join("#","Welcome" ,"to" ,"my" ,"Programming"));
		
		
		
		
		try {
			String s="apple";
			int s3 = 10;
			System.out.println(s + s3);
		}
		catch(Exception e){
			System.out.println(e);
		}
//		String s4 = s + s3;
		
//		System.out.println(s.concat(s3));

	}

}
