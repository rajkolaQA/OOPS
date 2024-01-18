package callingMethods;

public class Sample1 {

	
	public static void Interest() {
		System.out.println("Home Loan Interest");
		System.out.println("Business Loan Interest");
	}
	
	public void Bank() { 
		Interest();  //Static Method we can access in Non-Static method
	}
	
	public static void main(String[] args) {
		
		Sample1 s = new Sample1();
		s.Bank();   //To Access Non-Static method in Static through Object
		

	}

}
