package stringExample;

public class StringExample2 {
	public static void main(String args[]) {
		
		String s1 = new String("String With new keyword");
		String s2 = new String("s2 String");
		char[] ch = {'m','e','g','a','_', 'w','a','r','s'};
		String s3 = new String(ch);//converting char array to string
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
				
	}

}
