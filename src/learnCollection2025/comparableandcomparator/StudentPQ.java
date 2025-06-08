package learnCollection2025.comparableandcomparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class StudentPQ {
	public static void main(String args[]) {
													
		Queue<Student> studentPQ = new PriorityQueue<>(new StudentName() );
		
		studentPQ.add(new Student(55, "mega", "dubai" ));
		studentPQ.add(new Student(60, "jhon" ,"LA"));
		studentPQ.add(new Student(80, "leo", "CA"));
		studentPQ.add(new Student(30, "mejor", "uae"));
		studentPQ.add(new Student(90, "duke", "usa"));
		
		//System.out.print(studentPQ);
		
		//And any class you write — like Student, Employee, Product, 
		//etc. — is also a user-defined reference data type.
		
		/*Syntax for each loop
		For(datatype_Varible_name : Array_name or Collection){
			//body of loop
			}
		 	*/
		
		for(Student sd : studentPQ) {
			System.out.println(sd); // ascending order
		}
		
		
		System.out.println("\nStudent list after poll operation\n");
		
		studentPQ.poll();
		
		for(Student sd: studentPQ) {
			System.out.println(sd);
		}
		
		System.out.println("\nStudent list descanding order city using comparator\n");
		
		for(Student sd : studentPQ) {
			System.out.println(sd);
		}
	
	}
}
