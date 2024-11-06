package stringExample;

public class StringExample1 {
	public static void main(String args[]) {
		
		String a = "java";
		String b = "python";
		String c = "c++";
		String d = "java";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//You can check if both string references a and d 
		//point to the same object in memory by using the == operator
		// and with check same hash code
		
		if(a==d) {
			System.out.println("a and d are the same instance.");
			}else {
				System.out.println("a and d are different instance");
			}
		//checking hashcode of a and d both are same 
		
		System.out.println("hashcode of string a: "+a.hashCode());
		System.out.println("hashcode of string a: "+d.hashCode());

		
	}

}
