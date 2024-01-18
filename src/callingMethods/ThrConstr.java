package callingMethods;

public class ThrConstr {

	int studentRollNum;
	String studentName;

	public ThrConstr(int RollNum,String Name){ //Parameterized Constructor
		                                       //default Constructor created by java
		studentRollNum = RollNum;
		studentName = Name;
	}
	public void dispaly() {
		System.out.println(studentRollNum+" "+studentName);
	}
	public static void main(String[] args) {
		ThrConstr tc1 = new ThrConstr(140,"Telangana");//Constructor call
		ThrConstr tc2 = new ThrConstr(240,"Hyderabad");
		tc1.dispaly();
		tc2.dispaly();
	}
}
