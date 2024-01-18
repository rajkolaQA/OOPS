package heirarchal_inheritance;

public class Child3 extends Parent {

	public void Airways() {
		System.out.println();
		System.out.println("AirIndia");
		System.out.println("Emirates");
		System.out.println("US Airline");
	}
	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.Birds();
		ch.Airways();
	}
	
	}

