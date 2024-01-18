package single_inheritance;

public class Child extends Parent {

	public void car2() {
		System.out.println("Ferrari");
	}
	public static void main(String[] args) {
		
		Child sh = new Child();
		sh.car1();
		sh.car2();

	}

}
