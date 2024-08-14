package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ALPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = new Integer[] {1,2,3,4,5};
		//Object[] arr = new Object[] {1,2,3,4,5};
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(20);
		al1.add(30);
		al1.add(20);
		al1.add(30);
		al1.add(20);
		al1.add(30);
		al1.add(20);
		al1.add(30);
		
		System.out.println(al1);
		System.out.println(al1.size());
		
		Collections.synchronizedList(al1);
		
	}

}
