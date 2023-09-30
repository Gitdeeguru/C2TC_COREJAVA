package com.cg.packageone;

public class testOne {
	public int id=5;
	public void display() {
		System.out.println("Access Modifers");
	}

	public static void main(String[] args) {
		testOne t1 = new testOne();
		System.out.println(t1.id);
		t1.display();
	}

}
