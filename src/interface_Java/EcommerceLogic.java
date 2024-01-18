package interface_Java;

public class EcommerceLogic implements Ecommerce {

	
	public void LoginFunctionality() {
		
		System.out.println("Login Functionality Logic");
	}

	
	public void SearchFunctionality() {
		System.out.println("Search Functionality Logic");
		
	}

	
	public void SignuUpFunctionality() {
		System.out.println("SignUp Functionality Logic");
		
	}

	public static void main(String[] args) {
		EcommerceLogic ec = new EcommerceLogic();
		ec.LoginFunctionality();
		ec.SearchFunctionality();
		ec.SignuUpFunctionality();
	}
}
