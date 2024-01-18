package final_Keyword;

public class Final {

	final String EmpName = "Sairam";

	public static void main(String[] args) {

		Final f = new Final();

		System.out.println(f.EmpName);

		//	f.EmpName = "Rahul"; // here cannot reinitialized variable name because its final 

		//	System.out.println(f.EmpName);
	}

}
