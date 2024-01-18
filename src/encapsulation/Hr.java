package encapsulation;

public class Hr extends Company {
	
	
	public static void main(String[] args) {
		
		Hr hr = new Hr();
		
		hr.setEmpId(198);
		hr.setEmpName("John");
		hr.setDesignation("QA");
		
		System.out.println(hr.getEmpId());
		System.out.println(hr.getEmpName());
		System.out.println(hr.getDesignation());
	}

}
