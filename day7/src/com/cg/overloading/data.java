package com.cg.overloading;

public class data {
	private float x;
	private float y;
	private float z;
	
	
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}



	public data(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	

	public data(float x) {
		super();
		this.x = x;
	}
	


	public data(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	

	@Override
	public String toString() {
		return "data [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
