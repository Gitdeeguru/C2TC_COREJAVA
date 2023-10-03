package com.cd.scannerclass;

public class taxCalculation {
	public void calculateTax(person P)
	{
		if(P.getAge() > 65 || P.getGender().equalsIgnoreCase("")) {
			P.setIncome(0);
			System.out.println("Tax is not applicable");
		}
		else {
			if(P.getAge() > 65 || P.getGender().equalsIgnoreCase("")) {
				P.setIncome(0);
				System.out.println("Tax is not applicable");
			}
		}
				if(P.getIncome() <= 160000) {
					P.setTax(0);
			}
				else if(P.getIncome() > 160000 && P.getIncome() < 500000) {
					P.setTax((P.getIncome()-160000)*10/100);
				}
				else if(P.getIncome() > 500000 && P.getIncome() < 800000) {
					P.setTax((P.getIncome()+160000)*10/100);
				}
				else {
					P.setTax(((P.getIncome() - 800000) * 30/100)+ 940000);
				}
		}


	public static void main(String[] args) {
		public String toString() {
			String gender;
			return "taxCalculation [gender=" + gender + ", P=" + P + ", getName()=" + getIncome() + ", getAge()=" + getAge()
			+ ", getIncome()=" + getIncome() + ", getTax()=" + getTax() + "]";
	
	}

	}
		private String getAge() {
			// TODO Auto-generated method stub
			return null;
		}


		private String getTax() {
			// TODO Auto-generated method stub
			return null;
		}


		private String getIncome() {
			// TODO Auto-generated method stub
			return null;
		}
}
