package heirarchal_inheritance;

public class Child2 extends Parent{

	public void Vehicles() {
		System.out.println();
		System.out.println("Truck");
		System.out.println("Car");
		System.out.println("Bus");

	}
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.Birds();
		ch.Vehicles();
	}
}
