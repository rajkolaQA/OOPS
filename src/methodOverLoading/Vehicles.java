package methodOverLoading;

public class Vehicles {
	
	public void Hyundai() {
		//System.out.println("Model i20");
	}

	public void BMW() {
		System.out.println("BMW X5");
	}
	
	public void Hyundai(String color) {
		System.out.println("Black");
	}
	
	public void Hyundai(int Price) {
		System.out.println("10,00,000");
	}
	
	public void Hyundai(int Price,String color) {
		System.out.println("Price and Color");
	}
	public static void main(String[] args) {
		Vehicles v = new Vehicles();
		v.BMW();
		v.Hyundai();
		v.Hyundai(1200000);
		v.Hyundai("Black");
		v.Hyundai(13000000, "Red");
	}
}
