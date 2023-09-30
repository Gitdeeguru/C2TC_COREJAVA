package com.cg.multiinheritance;

public class State extends Country {
	private String stateName;
	private String StateCode;
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public State(String stateName, String stateCode) {
		super();
		this.stateName = stateName;
		this.StateCode = stateCode;
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCode() {
		return StateCode;
	}
	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", StateCode=" + StateCode + ", getStateName()=" + getStateName()
				+ ", getStateCode()=" + getStateCode() + "]";
	}
	
	
}
