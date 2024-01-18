package typeCasting;

public class ExplicitTypecasting {

	public static void main(String[] args) {
		
		long l = 500;
	//	byte b = l;   //here it is going to be error
        byte b = (byte)l; //Here it is known as Explicit typeCasting
        System.out.println(b);
	}

}
