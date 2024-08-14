package exceptionhandling;

public class Demo {
	
	
	
	
	public static void main(String[]args) {
		
		int a , b ,c=0;
		
		a = 10;
		b= 0;
		
		try {
			
			c= a/b;
		}
		catch(Exception e){
			
			throw e;
			
		}
		finally {
			
			System.out.println("Finally block");
		}
		
		System.out.println(" The value of c is " + c );

	}
	
}
