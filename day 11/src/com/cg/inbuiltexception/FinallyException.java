package com.cg.inbuiltexception;

public class FinallyException {
	public static void main(String args[]) {
//	try {
		int x = 100/3;
//		System.out.println("Inside try block" +x);
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
	finally {   /*finally used only checked which means 
		when you handle your exception inside try and block*/
		System.out.println("Inside Finally block");
	}
}
}
