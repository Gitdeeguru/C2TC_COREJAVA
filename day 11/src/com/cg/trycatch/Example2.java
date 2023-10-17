package com.cg.trycatch;

public class Example2 
{
	public static void main(String[] args) 
	{
		Example2 ex= new Example2();
		try {
			ex.mod();
		}
		catch(ArithmeticException e) {
			System.out.print("ArithemeticException thrown by mod method is caught");
		}
	}


	public void mod() {
		{
		try {
			System.out.print(100/0);
		}
		catch(Exception e) {
			System.out.println("we have exception" + e);
		}
		System.out.print("outside try and catch block");
	}
	}


	

}
