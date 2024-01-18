package superKeyword;

public class DogChild extends DogParent{
	
	String DogName= "Labrador";
	
	
	public DogChild() {
		super(); //It is used to refer ParentClass Constructor
	}
	public void DogEats() {
		System.out.println("Dog Eats Chicken");
	}

	public void m1() {
		super.DogEats();
	}
	public void dispaly() {
		System.out.println(super.DogName);
	}
	
	
	public static void main(String[] args) {
		
		DogChild d = new DogChild();
		//System.out.println(d.DogName);
		d.dispaly();
		d.m1();
		
	}
}
