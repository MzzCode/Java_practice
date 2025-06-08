package learnCollection2025.comparableandcomparator;

public class Student implements Comparable<Student> { //type of comparable is Student
	
	private Integer marks;
	private String name;
	private String city;
	
	public Student(Integer marks, String name, String city) {
		this.marks = marks;
		this.name = name;
		this.city = city;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Students Detail: Student [marks=" +marks+ ", name=" +name + ", city=" +city+ "]";
		
	}
	// Natural ordering: sort by marks in ascending order
	
	public int compareTo(Student other) {
		return this.marks.compareTo(other.marks); // ascending order
		
	}
}
