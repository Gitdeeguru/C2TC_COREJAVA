package com.cg.statickayword;

class Outer{
	static int a= 10;

	  class Inner{
		 void msg() {
			System.out.println("value of a: " +a);
		}
	}
}

public class StaticClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.a);
		o.a = 30;
//		System.out.println(o.a);
		Outer.Inner i = o.new Inner();
		i.msg();
	}
}

