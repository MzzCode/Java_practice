/*package com.oops;


class Person{
	String name;
	int age;
	}
public class DefaultConstructor {
public static void main(String[] args) {
	Person p1 = new Person();
	System.out.println("Name: " +p1.name);
	System.out.println("Age: " +p1.age);
}
}
/*
 * this program gives error: Exception in thread "main" java.lang.NoSuchMethodError: com.oops.Person: method 'void <init>()' not found
	at com.oops.DefaultConstructor.main(DefaultConstructor.java:10)
	
this is because: Name Conflict: If there were multiple .java files in your com.oops package, 
and one of them also contained a class named Person(in this case a AnonymousObjectExample have class person which is also present in oops class), 
the JVM might have been confused about which Person class to use. 
This can lead to errors like NoSuchMethodError if the wrong class file is being referenced at runtime.

Solution: Resolution of Conflict: By renaming one of the Person classes to Perso, 
you effectively removed the conflict. Now, the JVM can correctly identify and load the Person class you intended to use.
 */


