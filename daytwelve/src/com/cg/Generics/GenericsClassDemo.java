package com.cg.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClassDemo {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		GenericsClass<Integer> gc = new GenericsClass<Integer>();
		gc.data=10;
//		gc.data=10.0f;//error
		
		GenericsClass<Integer> gc1 = new GenericsClass<Integer>();
		gc1.data=20;
		
		
		GenericsClass<Float> gc2 = new GenericsClass<Float>();
		gc2.data=10.0f;
	}

}
