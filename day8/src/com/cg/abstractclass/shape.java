package com.cg.abstractclass;


//Abstract class
public abstract class shape {
	
	float area;
	
	abstract float calArea();
	
	void show() {
		System.out.println("Area of Shape" +area);
	}
}
