package com.cg.overriding;

public class OverRidingMain {
	public static void main(String[] args) {
		RBI r =new RBI();
		System.out.println(r.rateofinterest());
		
		SBI s =new SBI();
		System.out.println(s.rateofinterest());
		
	}
}
