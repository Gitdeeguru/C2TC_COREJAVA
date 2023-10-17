package com.cg.UserDefinedException;

public class Validate {
	public static void Validate(int age,int weight) throws Exception{
		if(age < 18 || weight < 55) {
			throw new UserDefinedException("Your are eligible to blood denote");
		}
		else{
			System.out.println("your are not eligible to denote blood");
		}
	}
}

