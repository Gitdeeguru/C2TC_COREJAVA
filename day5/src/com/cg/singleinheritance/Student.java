package com.cg.singleinheritance;

public class Student extends Citizen{
	private int rollno;
	private String collagename;
	
	
	public Student() {
		super();
	}
	
	
	public Student(String name, int addharNo, String address, long phonoNo, int rollno, String collagename) {
		super(name, addharNo, address, rollno);
		this.rollno = rollno;
		this.collagename = collagename;
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollagename() {
		return collagename;
	}
	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collagename=" + collagename + ", getName()=" + getName()
				+ ", getAddharNo()=" + getAddharNo() + ", getAddress()=" + getAddress() + ", getPhonoNo()="
				+ getPhonoNo() + "]";
	}


	
	
	
	}
	
	
	

