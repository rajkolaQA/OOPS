package downCasting;

public class Cat extends Animal{

	public void Eat() {
		System.out.println("Cat is Eating");
	}
	public static void main(String[] args) {
		
		Animal an = new Cat(); 
		Cat c = (Cat)an;      // Here used DownCasting 
		c.Dog();
		c.Eat();
	}
}
