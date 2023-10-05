package com.cg.arraytopic;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		
		//tostring
		int arr[] = {30,20,10};
//		System.out.println(arr);
//		System.out.println(Arrays.toString(arr)); //Arrays is a class
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
//		//search
//		int key=40;
//		Arrays.binarySearch(arr, key);
//		System.out.println(Arrays.binarySearch(arr, key));
//		
//		
		//comparison
		int arr1[] = {10,20,30};
		System.out.print(Arrays.equals(arr, arr1));
		
		
		//copy
//		int arr2[] = Arrays.copyOf(arr, 2);
//		System.out.println(Arrays.toString(arr2));
//		
//		
//		//arrays.fill
//		Arrays.fill(arr2, 22);
//		System.out.println(Arrays.toString(arr2));
		
		
		
		//sort
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		//tostring is a method that converts the objects into values
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//			System.out.println(arr[2]);
//		}
		
	}

}
