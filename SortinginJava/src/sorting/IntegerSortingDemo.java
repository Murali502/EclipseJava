package sorting;

import java.util.ArrayList;
import java.util.Collections;

import myUtility.Myutilities;

public class IntegerSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerlist =new ArrayList<>();
		integerlist.add(15);
		integerlist.add(10);
		integerlist.add(8);
		integerlist.add(19);
		integerlist.add(12);
		integerlist.add(11);
		
		//Myutilities.extractedInteger(integerlist);
		Collections.sort(integerlist);
		Myutilities.iteratListString(integerlist);
		
		/*Collections.sort(integerlist);
		System.out.println("After sort");*/
		//extracted(integerlist);
		
	}

	

}
