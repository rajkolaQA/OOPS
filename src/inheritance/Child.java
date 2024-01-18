package inheritance;

public class Child extends Parent {

	public void Animal3() {
		System.out.println("Lion");
	}
	public static void main(String[] args) {
		Child ch = new Child();
			ch.Animal1();
			ch.Animal2();
			ch.Animal3();
		}
	}
