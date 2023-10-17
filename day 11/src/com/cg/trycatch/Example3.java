package com.cg.trycatch;

public class Example3 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[6] = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException" +e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException" +e);
		}
		
		catch(Exception e) {
			System.out.println("Parent Exception occurs" +e);
		}
		
		//catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException e)
		System.out.print("The rest of the code");
	}

}
