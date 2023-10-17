package com.cg.abstractclass;

public class MainShapeAbstraction {

	public static void main(String[] args) {
		triangle s = new triangle();
		rectangle r = new rectangle();
		s.side = 5;
		System.out.println(s.calArea());
//		s.show();
		r.breadth=2.3f;
		r.length=5.3f;
		System.out.println(r.calArea());
	}
}

