package this_Keyword;

public class Employee {
	
	public int EmpId;
	
	public void m1(int EmpId) {
		
		this.EmpId = EmpId; // Here this keyword referred instance variables
		                    // To avoid ambiguity between local variables and instance variables
	}                       // this is used current class variable(Instance variable)

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.m1(228);
		System.out.println(emp.EmpId);
	}
}
