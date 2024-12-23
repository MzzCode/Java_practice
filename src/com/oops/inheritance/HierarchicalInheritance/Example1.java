package com.oops.inheritance.HierarchicalInheritance;

class One{
	public void oneClassMethod() {
		System.out.println("class one method call...");
	}
}
class Two extends One{
	public void twoClassMethod() {
		System.out.println("class two method call...");
	}
}
class Three extends One{
	public void threeClassMethod() {
		System.out.println("class three method call...");
	}
}
class Four extends One{
	public void fourClassMethod() {
		System.out.println("class four method call...");
	}
}
public class Example1 {
	public static void main(String[] args) {
	
	Two m2 = new Two();	
	m2.oneClassMethod();
	m2.twoClassMethod();
	
	Three m3 = new Three();
	m3.oneClassMethod();
	m3.threeClassMethod();
	
	Four m4 = new Four();
	m4.oneClassMethod();
	m4.fourClassMethod();
	}
}
