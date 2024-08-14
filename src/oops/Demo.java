package oops;

import java.util.Scanner;

public class Demo {

	
	float p,t, si;
	static float r = 2.5f;
	
	void input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principle");
		p = scan.nextFloat();
		
		System.out.println("Enter the time");
		t = scan.nextFloat();
		
		
	}
	
	void calcsi() {
		
		si= (p*t*r)/100;
	}
	
	void disp() {
		
		System.out.println("SI is " + si);
	}
}

