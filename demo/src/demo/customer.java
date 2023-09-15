package demo;

public class customer {
	
		int customer_id;
		String customer_name;
		int customer_age;
		String customer_address;
		
		
		//user-defined non-parameter, non-argument
		public customer() {
			
		}
		
		
		//user-defined parameter/argument
		public customer(int id, String name,int age, String Address) {
			customer_id=id;
			customer_name=name;
			customer_age=age;
			customer_address=Address;
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


