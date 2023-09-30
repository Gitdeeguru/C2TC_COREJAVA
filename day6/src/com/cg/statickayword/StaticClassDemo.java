package com.cg.statickayword;

class Outer{
	static int a= 10;
	
	static class Inner{
		void msg() {
			System.out.println(a);
		}
	}
}


public class StaticClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.a);
		o.a = 30;
		Outer.Inner i = new Outer.Inner();
		i.msg();
		
	}
}
