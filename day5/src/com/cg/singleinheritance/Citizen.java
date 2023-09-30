package com.cg.singleinheritance;

public class Citizen {
	private String name;
	private int addharNo;
	private String address;
	private long phonoNo;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, int addharNo, String address, long phonoNo) {
		super();
		this.name = name;
		this.addharNo = addharNo;
		this.address = address;
		this.phonoNo = phonoNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(int addharNo) {
		this.addharNo = addharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonoNo() {
		return phonoNo;
	}
	public void setPhonoNo(long phonoNo) {
		this.phonoNo = phonoNo;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", addharNo=" + addharNo + ", address=" + address + ", phonoNo=" + phonoNo
				+ "]";
	}
	
	
	
}
