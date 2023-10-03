package com.cg.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		
		//AutoBoxing note:- to use wrapper method use Integer before datatype intializition (converting to primitive to wrapper)
		int i = 20;  //primitive type creation
		Integer k = i;  //implicit means automation explicit user has to type manual (implicit and explicit) is called type casting
		
		//unboxing (converting to primitive to wrapper)
		Integer x= 20;
		int y = x;  //int y = x.intvalue(); from older version
		
		
		float a = 29.0f;
		Integer e = (int)a;
		
		float v = 29.0f;
		int u = (int)a; 
	}

}
