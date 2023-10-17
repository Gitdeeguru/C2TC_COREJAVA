package com.cg.ListInterfaxe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(434);
		list.add(1);
		
		list.addFirst(200);
		list.addLast(34);
		list.addAll(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
		LinkedList<Integer> llOne = new LinkedList<Integer>();
		llOne.add(54);
		list.addAll(llOne);
		
		ListIterator<Integer> list1 = list.listIterator();
		while(list1.hasNext()) {
			System.out.println(list1.next());
		}
		Collections.sort(list);
		System.out.println(list);
		
		
		//userdefined 
		LinkedList<Person> li = new LinkedList<>();
		li.add(new Person("Deepak",21));
		li.add(new Person("Tango",32));
		Collections.sort(li); //we cant sort userdefind object instead use topic called comparator and comparable
		System.out.println(li);
	}

}
