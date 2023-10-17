package com.cg.trycatch;

public class tryCatch {
	public static void main(String[] args) {
		//compile time (checked) (IO exception)( import and give throws exception in method which is error occuring)
		//run time (uncheck) (Arithemetic)
		//if you do not have try and catch in your program then it is unhandled else it is handled
		int x= 10;
		int y = 0;
		try {
			int z = x/y; //zero division error
			System.out.print(z);
		}
		catch(ArithmeticException e) {
			System.out.print(e);
		}
	}
}
