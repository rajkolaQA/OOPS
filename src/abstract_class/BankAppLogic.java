package abstract_class;

public class BankAppLogic extends BankApp{

	
	public void MobileBanking() {
		System.out.println("SBI Mobile Banking");
		}
	public static void main(String[] args) {
		BankAppLogic L = new BankAppLogic();
		L.interest();
		L.HomeLoan();
		L.MobileBanking();
	}
	
	
}
