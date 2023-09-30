package com.cg.finalkeyword;

public class FinalVariable {
	final int value=20;
	
	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.value=40;
		System.out.println(f.value);
	}
}
