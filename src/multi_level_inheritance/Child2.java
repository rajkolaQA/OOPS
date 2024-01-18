package multi_level_inheritance;

public class Child2 extends Child1 {

	public void Color3() {
		System.out.println("Green");
	}
	
	public static void main(String[] args) {

       Child2 ch = new Child2();
       ch.Color1();
       ch.Color2();
       ch.Color3();

	}
}
