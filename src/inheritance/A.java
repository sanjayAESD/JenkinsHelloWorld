package inheritance;

public class A  {

	A(){
		
		System.out.println("A constructor executed");
	}
	
	
}


class B extends A{
	
	
	
	B(){
		
		System.out.println("B constructor executed");
	}
	
}


class C extends B{
	
	
	C(){
		
		System.out.println("C constructor");
	}
}