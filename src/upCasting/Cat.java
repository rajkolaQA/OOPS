package upCasting;

public class Cat extends Animal {

	public void Eat() {
		System.out.println("Eating");
	}
	public static void main(String[] args) {

//		Cat c = new Cat();	// 1 way of UpCasting
//		c.Dog();
//    	c.Eat();
		
		Animal a = new Cat(); //2nd way of UpCasting(here used Parent reference and Child Object)
    	a.Dog(); //Here reference is Animal so it can call Animal class methods only
     
		
		
	}
}
