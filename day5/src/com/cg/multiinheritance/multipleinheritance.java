package com.cg.multiinheritance;

interface Dad{
	void snoring();
}
interface mom{
	void snoring();
	}
	
class Child implements Dad,mom{
	public void snoring() {
		System.out.println("my parents have snoring problem");
}
}
public class multipleinheritance{
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.snoring();
	}
}
		
