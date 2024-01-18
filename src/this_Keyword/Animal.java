package this_Keyword;

public class Animal {

	public void Eat() {
		System.out.println("Food");
	}
	
	public void Run() {
		Eat(); // this.Eat(); (internally this will be used by java by default)
	}
	
	public void Sleep() {
		Eat(); // this.Eat(); (internally this will be used by java by default)
	}
	
	public static void main(String[] args) {
		 
		Animal a = new Animal();
		a.Run();      //Here this keyword used to refer current class Object
		a.Sleep();
	}
}
