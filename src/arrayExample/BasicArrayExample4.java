package arrayExample;

class Student{
public String name;
public int roll_num;
Student(String name, int roll_num ) {
	this.name = name;
	this.roll_num  = roll_num;
	
}
}

public class BasicArrayExample4 {
	public static void main(String args[]) {
		
		/*
		it gives error: Unresolved compilation problems

		Student [] arr = {("mega" ,1),("duke", 2), ("muke",3), ("leo", 4), ("geo", 5) };

		solution: 
			Object Creation with new: Each element of the array must be an instance of the Student class, 
			created with the new keyword and using the constructor of the Student class.
			*/
		
		Student[] arr = {new Student("mega",1),new Student("mike",2),new Student("leo",3),
		new Student("nike",4),
		new Student("like",5)
		};
		
		/*
		Student [] arr = new Student[5];
		arr[0] = new Student("mega", 1);
		arr[1] = new Student("vaibhav", 2);

		// so on...
		arr[2] = new Student("shikar",3);
		arr[3] = new Student("dharmesh",4);
		arr[4] = new Student("mohit",5);
		*/
	
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " + arr[i].name + " "  + arr[i].roll_num);
            
           }
        
        System.out.println("\nEnhanced for loop execution: \n");
        
        // we can also access this using enhanced for loop
       // if we run enhanced for loop with index without initilize it gives compilation error
        // for resolving this we create
        int i = 0;
        for(Student Info : arr) {
        	System.out.println("Element at " + i + " : "
                    + Info.name + " "
                    + Info.roll_num);
        	 i++;
        }
       
	}
}




