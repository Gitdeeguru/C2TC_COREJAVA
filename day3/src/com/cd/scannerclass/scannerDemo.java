package com.cd.scannerclass;
import java.util.Scanner;
public class scannerDemo {
	public static void main(String[] args) {
		person p = new person();
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
		System.out.print("Befor taxcalculation");
		System.out.println(p.getIncome()+p.getTax()+p.getName()+p.getAge());
		}
}
