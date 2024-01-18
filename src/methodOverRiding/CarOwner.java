package methodOverRiding;

public class CarOwner extends Car {
	
	public void CarColour() {//OverRide
		System.out.println("Car colour is Black");
	}

	public static void main(String[] args) {
		
	    CarOwner c = new CarOwner();
		c.CarColour();
	  // OR
	//	Car cr = new CarOwner();
	//	cr.CarColour();
	}
}
