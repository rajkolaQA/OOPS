package heirarchal_inheritance;

public class Child1 extends Parent {
	
	public void Animals() {
		System.out.println();
		System.out.println("Tiger");
		System.out.println("Lion");
		System.out.println("Elephant");
		
	}
public static void main(String[] args) {
	Child1 ch = new Child1();
	ch.Birds();
	ch.Animals();
}
}
