package com.cd.scannerclass;

public class person {
		private String name;
		private int age;
		private int income;
		private static String gender;
		private int tax;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public static String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		@Override
		public String toString() {
			System.out.println("before tax calculation");
			return "person [name=" + name + ", age=" + age + ", income=" + income + ", gender=" + gender + ", tax="
					+ tax + "]";

		}		
		
	}


