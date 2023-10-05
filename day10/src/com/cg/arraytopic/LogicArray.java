package com.cg.arraytopic;

public class LogicArray {
	public static void printArray(int arr[][]) {
		
		
		// 2 * 2 matric 10 20
		//				30 40
		for(int i=0;i < arr.length; i++) {
			for(int j=0;j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
