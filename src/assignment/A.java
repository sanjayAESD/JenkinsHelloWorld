package assignment;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Starting number");
		int sn = scan.nextInt();
		
		
		System.out.println("Enter the Ending number");
		int en = scan.nextInt();
		
		int sum = 0;
		
		for(int number = sn; number>=en; number--) {
			if(number%2==1)
				//sum = sum+number;
			System.out.println(number);
		}
		
		//System.out.println(sum);
		
	}

}
