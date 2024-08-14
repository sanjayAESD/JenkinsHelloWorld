package polymorhism;


//run-time polymorphism:- Parent reference to child object
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parent p = new Parent();
		Child1 c1 = new Child1();
		
		Parent ref;
		ref = p;
		
		ref.disp();
		
		ref = c1;
		ref.disp();
		
	}

}
