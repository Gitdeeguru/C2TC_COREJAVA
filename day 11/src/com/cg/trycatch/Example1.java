package com.cg.trycatch;

public class Example1 {

	
	public static void print(int arr[]) {
		System.out.println(arr[2]);
		System.out.println("Fourth Element");
	}
	public static void main(String[] args) {
		System.out.println("First Element");
		System.out.println("Second Element");
		int arr[] = new int[] {12,24,34};
		try {
			print(arr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Third Element");
	}

}
