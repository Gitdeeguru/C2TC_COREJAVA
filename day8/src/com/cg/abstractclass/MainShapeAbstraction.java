package com.cg.abstractclass;

public class MainShapeAbstraction {

	public static void main(String[] args) {
		triangle s = new triangle();
		s.side = 5;
		System.out.println(s.calArea());
//		s.show();
	}
}

