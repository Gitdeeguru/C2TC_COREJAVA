package com.cg.stringoperation;

//extends object is Cosmic superclass
class employee extends Object{ //base,super,parent
	public String name;
	public int Rollno;
	
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(String name, int rollno) {
		super();
		this.name = name;
		Rollno = rollno;
	}
	
	
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", Rollno=" + Rollno + "]";
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}		
		if(obj==null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass())
			return false;
		
		employee e= (employee)obj;
		return this.name.equals(e.name) && this.getRollno() == e.getRollno();
		
		}
}


public class StringProgram {

	public static void main(String[] args) {
		
		String s1= "java";
		String s2="java";
		String s3= new String("java");
		String s4= new String("java");
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		
		employee e = new employee();
		e.name="Deepak";
		e.Rollno=22;
		
		
		employee e1 = new employee();
		e1.name="Deepak";
		e1.Rollno=22;
		
		System.out.println(e.name);
		System.out.println(e.Rollno);
		
		System.out.print(e.equals(e1));
	}

}
