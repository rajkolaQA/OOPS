package multiple_inheritance;

public class Fruits implements Parent1,Parent2{

	@Override
	public void Apple() {

System.out.println("Apple");
		
	}

	@Override
	public void Mango() {

System.out.println("Mango");
		
	}
	public static void main(String[] args) {
		Fruits fr = new Fruits();
		fr.Apple();
		fr.Mango();
	}

}
