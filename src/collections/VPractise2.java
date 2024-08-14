package collections;

import java.util.Arrays;
import java.util.Vector;

public class VPractise2 {

	public static void main(String[] args) {

		//Generics  java 1.5
		//Vector java 1.0
		//Collections 1.2
		
		//Conversion of an Object array to list
		Object[] arr = new Object[] {1,2,3,4,5};
		//Vector v1 = new Vector(Arrays.asList(arr));
		
		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(null);
		v1.add(null);
		v1.add(20);
		
		/*
		 * int sum = 0;
		 * 
		 * for(int i=0; i<v1.size(); i++) {
		 * 
		 * sum += (Integer) v1.get(i);
		 * 
		 * 
		 * }
		 */
		
		//System.out.println(sum);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		

	}

}
