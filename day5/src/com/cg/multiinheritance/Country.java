package com.cg.multiinheritance;

public class Country {
	private String countryname;
	private String countrycode;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Country(String countryname, String countrycode, String cityName, String address, String stateName, String stateCode) {
		super(cityName, address, stateName,stateCode);
		this.countryname = countryname;
		this.countrycode = countrycode;
	}



	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}



	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", countrycode=" + countrycode + ", getStateName()="
				+ getStateName() + ", getStateCode()=" + getStateCode() + ", getCityName()=" + getCityName()
				+ ", getAddress()=" + getAddress() + "]";
	}
	
	
}
