package abstraction;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop d = new Dell();
		
		d.copy();
		d.cut();
		
		
		Lenono l = new Lenono();
		l.copy();
		
		
		HP hp = new HP();
		hp.copy();
	}

}
