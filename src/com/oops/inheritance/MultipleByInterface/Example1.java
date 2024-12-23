// 	class A {
//	    public void show() {
//	        System.out.println("Welcome class A");
//	    }
//	
//	class B {
//	    public void display() //show()
//	    {
//	        System.out.println("Hello Class B");
//	    }
//	}
//	
//	class C extends A,B { 
//		    public void show() {
//		    	super.display();
//		    	System.out.println("A&B");
//		    }
//	}
//	public class Example1 {
//	    public static void main(String[] args) {
//	         C obj = new C(); // This line will also cause a compile-time error
//	         obj.show();
//	    }
//	}
