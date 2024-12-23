package com.oops.inheritance.multilevel;

class One{
	public void setFirstName() {
		System.out.println("mega");
	}
}
	class Two extends One{
		public void setSecondName() {
			System.out.println("wars");
		}
	}
	class Three extends Two{
		public void setLastName() {
			System.out.println("start");
		}
	}

public class Example1 {
	public static void main(String[] args) {
		Three t1 = new Three(); //object create
		//method calling
		t1.setFirstName();
		t1.setSecondName();
		t1.setLastName();
	}

}
