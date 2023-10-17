package com.cg.UserDefinedException;

import java.util.Scanner;

public class UserDefinedMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		int age = sc.nextInt();
		System.out.println("Enter your weight: ");
		int weight = sc.nextInt();
		try {
			Validate.Validate(age,weight);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
