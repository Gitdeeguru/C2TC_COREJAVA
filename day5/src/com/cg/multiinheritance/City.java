package com.cg.multiinheritance;

public class City extends State{
	private String cityName;
	private String address;
	
	
	
	public City() { 
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public City(String cityName, String address) {
		super();
		this.cityName = cityName;
		this.address = address;
	}


	public City(String stateName, String stateCode, String cityName) {
		super(stateName, stateCode, cityName);
		// TODO Auto-generated constructor stub
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", address=" + address + ", getStateName()=" + getStateName()
				+ ", getStateCode()=" + getStateCode() + ", getCountryname()=" + getCountryname()
				+ ", getCountrycode()=" + getCountrycode() + "]";
	}
	
	
	
	
	
}
