package com.cg.inbuiltexception;

public class throwException {

	public static void validate(int age) {
		if(age < 19 || age > 27) {
			throw new ArithmeticException("Age limit");
		}
		else {
			System.out.print("Your are eligible");
		}
	}
	
	
	public static void main(String[] args) {
	validate(23);
	}
}
