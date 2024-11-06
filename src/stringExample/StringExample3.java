package stringExample;

public class StringExample3 {
   public static void main(String args[]) {
	 String s = "mega";
	 s.concat("wars"); //concat() method appends the string at the end  
	 System.out.println(s);////will print mega because strings are immutable objects 
	 // access the mega wars instance 
	 s = s.concat("wars");
	 System.out.println(s);
   }

}
