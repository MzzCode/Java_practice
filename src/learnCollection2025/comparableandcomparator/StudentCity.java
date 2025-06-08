package learnCollection2025.comparableandcomparator;

import java.util.Comparator;

//Custom comparator to sort students by city in descending order
public class StudentCity implements Comparator<Student>{

	// sort-by city in descending order
	
	public int compare(Student thisStudent, Student otherStudent) {
		return otherStudent.getCity().compareTo(thisStudent.getCity());
	}
}