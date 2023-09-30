package com.cg.constructorClass;

public class customer {
	
		private int customer_id;
		private String customer_name;
		private int customer_age;
		private String customer_address;
		
		
		
		
		public customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public customer(int customer_id, String customer_name, int customer_age, String customer_address) {
			super();
			this.customer_id = customer_id;
			this.customer_name = customer_name;
			this.customer_age = customer_age;
			this.customer_address = customer_address;
		}
		public int getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}
		public String getCustomer_name() {
			return customer_name;
		}
		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}
		public int getCustomer_age() {
			return customer_age;
		}
		public void setCustomer_age(int customer_age) {
			this.customer_age = customer_age;
		}
		public String getCustomer_address() {
			return customer_address;
		}
		public void setCustomer_address(String customer_address) {
			this.customer_address = customer_address;
		}
		@Override
		public String toString() {
			return "customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_age="
					+ customer_age + ", customer_address=" + customer_address + "]";
		}
		
		
	}


