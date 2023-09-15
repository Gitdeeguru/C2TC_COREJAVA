package demo;

public class construtorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c = new customer();//object creation
		customer c1 = new customer(1,"Anu", 24 ,"Bangalore");
				
		//value initialzation
//		c.customer_id = 1;
		c.setCustomer_id(1);
//		c.customer_name="Deepak";
		c.setCustomer_name("Deepak");
//		c.customer_age=24;
		c.setCustomer_age(24);
//		c.customer_address="Bangalore";
		c.setCustomer_address("Bangalore");
		
//		System.out.println(c.customer_id + " " + c.customer_age + " " + c.customer_name + " " + c.customer_address);
		
//		System.out.println(c.getCustomer_id() + " " + c.getCustomer_name() + " " + c.getCustomer_age() + " " + c.getCustomer_address());
		System.out.println(c);
		System.out.println(c1);
	
		
	}

}
