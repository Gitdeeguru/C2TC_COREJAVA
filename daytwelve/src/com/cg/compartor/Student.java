package com.cg.compartor;

public class Student implements Comparable<Student> {
	private String Name;
	private int Rollno;
	private float CGPA;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollno, int cGPA) {
		super();
		Name = name;
		Rollno = rollno;
		CGPA = cGPA;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public float getCGPA() {
		return CGPA;
	}
	public void setCGPA(int cGPA) {
		CGPA = cGPA;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Rollno=" + Rollno + ", CGPA=" + CGPA + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		return (int) (this.CGPA - o.CGPA);   //do type casting cgpa is float and convert that to int
//	}
	
	@Override
	public int compareTo(Student o) {
		return  this.Name.compareTo(o.Name);   //if it string use compareTo for name comparison
	}
	
}
