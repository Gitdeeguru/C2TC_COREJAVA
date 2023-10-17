package com.cg.ListInterfaxe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
	List list = new ArrayList();
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	list.add(10);
	list.add(true);
	list.add("hi");
	list.add(10);
	list.add(2,null);
	System.out.println(list);
	
	list.remove(true);
	System.out.println(list);
	
	System.out.println(list.get(2));
	
	System.out.println(list.lastIndexOf(10));
	
	//try this before sorting
//	list.add(10);
//	list.add(34);
//	list.add(54);
//	list.add(12);
//	list.add(46);
	Collections.sort(list);
	}
}	
