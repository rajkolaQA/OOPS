package flowOfProgram;

public class FlowOfProgram {
	
	int x;
	String name;
	
	static String Domain;  // static variables;
	static float interest; // static variables;
	
	{
		System.out.println("Instance Blocks-1"); //Instance Block
	}
	
	{
		System.out.println("Instance Blocks-2"); //Instance Block
	}
	
	static {
		    System.out.println(interest);     // Default value of float is 0.0
		    System.out.println("Static Block-1");// Static Block
	       }
	
	static {
		    float interest = 12.0f;
		    System.out.println(interest);
		    System.out.println("Static Block-2");//Static Block
	       }
	
         public static void m1() {
        	 System.out.println("Static Method");//Static method
         }
         
         public void m2() {
        	 System.out.println("Instance method");//Instance method
         }
         
         public FlowOfProgram() {
        	 System.out.println("This is my Constructor");// Constructor 
         }
         
         public static void main(String[] args) {
        	 FlowOfProgram f = new FlowOfProgram();//When Constructor invoked then automatically instance blocks invoked or called.
        	  f.m2();
        	  m1();
		}
}
