package callingMethods;

public class ThroughObject {
	
	int id;
	String Name;
	
	public void Display() {
		System.out.println(id+" "+Name);
	}

	public static void main(String[] args) {
		ThroughObject c = new ThroughObject();
		c.id = 127;
		c.Name = "Rahul";
		c.Display();
		
	}
}
