package callingMethods;

public class ThroughMethod {

	int empid;
	String empname;
	
	public void m1(int id,String name) {
		empid = id;
		empname = name;
	}
	public void Display() {
		System.out.println(empid+" "+empname);
	}
	public static void main(String[] args) {
		ThroughMethod c = new ThroughMethod();
		c.m1(129, "Harris Jayaraj");
		c.Display();
	}
}
