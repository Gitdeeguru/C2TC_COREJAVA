package com.cg.trycatch;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 10;
		int y = 0;
		try {
//			int z = x/y1;      //compile time error (checked)
			int z = x/y;       // error free line (unchecked)
			System.out.print(z);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
