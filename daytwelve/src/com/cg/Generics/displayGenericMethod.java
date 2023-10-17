package com.cg.Generics;

public class displayGenericMethod {
	public static void main(String args[]) {
		Integer[] intarray = {10,29,394,29};
		String[] stringArray= {"Hello","Welcome","to","the","session"};
		GenericMethod gm = new GenericMethod();
		Person p1[] = new Person[] {new Person("Deepak",21), new Person("mohan",34)};
		gm.displayArrayElements(intarray);
		gm.displayArrayElements(stringArray);
		gm.displayArrayElements(p1);
		
	}
}
