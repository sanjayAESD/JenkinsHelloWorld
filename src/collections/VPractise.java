package collections;

import java.util.Arrays;
import java.util.Vector;

//Vector
public class VPractise {

	public static void main(String[] args) {

		
		//size - no of elements present in list
		//capacity - Vector capacity - 10(default capacity)
		
		//Creation of a List
		Vector v1 = new Vector();
		
		//Addition of elements into the list
		v1.add("Ramesh");
		v1.add("Suresh");
		v1.add(0,"Veeresh");
		v1.add("y1");
		v1.add("y2");
		v1.add("y3");
		v1.add("y4");
		v1.add("y5");
		v1.add("y6");
		v1.add("y7");
		
		//v1.add("y8");
		
		System.out.println(v1);
		
		  Vector v2 = new Vector(); 
		  v2.add("Rakshith"); 
		  v2.add("Roopesh");
		  
		  v1.addAll(0, v2);
		 
			/*
			 * for(int i=0; i<v2.size(); i++) { v1.add(v2.get(i)); }
			 */
		 		
		System.out.println(v1);
		System.out.println("Size is : " + v1.size());
		System.out.println("Capacity is : " + v1.capacity());
		
		//Retrieval of elements from the list
		System.out.println(v1.get(0));
		
		//Delection of elements from the list
		v1.remove(0);
		System.out.println(v1);
		
		//v1.removeAll(v2);
		//System.out.println(v1);
		
		//Clear the entire list
		//v1.clear();
		//System.out.println(v1);
		
		Vector v3 = new Vector();
		v3.add("Suresh");
		v3.add("Veeresh");
		v3.add("Roopesh");
		
		System.out.println(v3);
		
		//Verification of elements 
		System.out.println(v1.contains("y1"));
		System.out.println(v1.containsAll(v3));
		
		//Updation of elements into the list
		v1.set(1, "Satish");
		System.out.println(v1);
		System.out.println(v1.get(1));
		System.out.println(v1.lastIndexOf("Suresh"));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		//Conversion of vector to array
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
		
		

	}

}
