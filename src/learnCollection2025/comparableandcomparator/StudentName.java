package learnCollection2025.comparableandcomparator;

import java.util.Comparator;

//Custom comparator to sort students by name (ascending)

public class StudentName implements Comparator<Student>{ // type of comparator is Student 
	
	// sort-by name in ascending order
	
	@Override
	public int compare(Student thisStudent, Student otherStudent) {
		return thisStudent.getName().compareTo(otherStudent.getName()); // ascending order
	}
}
