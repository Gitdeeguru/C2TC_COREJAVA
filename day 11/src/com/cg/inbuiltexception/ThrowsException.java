package com.cg.inbuiltexception;

import java.io.IOException;

public class ThrowsException {
	public static void validate(int age) throws Exception{
		if(age < 19 || age > 27) {
			throw new IOException("Age limit");
		}
		else {
			System.out.print("Your are eligible");
		}
	}
	
	
	public static void main(String[] args) {
	try {
		validate(89);
	}
	catch(Exception e) {
		System.out.print(e);
		}
	}
}