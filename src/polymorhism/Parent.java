package polymorhism;

public class Parent {
	
	void disp() {
		
		System.out.println("Inside Parent disp");
	}

}

class Child1 extends Parent{
	
	void disp() {
		
		System.out.println("Inside Child1 disp");
	}
}

class Child2 extends Parent{
	
	
	void disp() {
		
		System.out.println("Insode Child2 disp");
	}
}

