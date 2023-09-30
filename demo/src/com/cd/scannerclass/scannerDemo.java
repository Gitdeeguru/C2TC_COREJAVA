package com.cd.scannerclass;
import java.util.Scanner;

import com.cg.constructorClass.customer;
public class scannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FIrst Name: ");
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your income: ");
		int income = sc.nextInt();
		
		System.out.println("Enter your gender: ");
		String gender = sc.next();
		
		person P =  new person();
		P.setName(name);
		P.setAge(age);
		P.setGender(gender);
		P.setIncome(income);
		
		taxCalculation tc = new taxCalculation();
		
		
		
		customer c1 = new customer(1,"Anu", 24 ,"Bangalore");
		
		//value initialzation
//		c.customer_id = 1;
		c.setCustomer_id(1);
//		c.customer_name="Deepak";
		c.setCustomer_name("Deepak");
	}
}
