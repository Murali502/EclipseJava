package myUtility;

import java.util.ArrayList;

public class Myutilities {


	public static <T> void iteratListString(ArrayList<T> anylist) {
		for(T temp: anylist)
		{
			System.out.println(temp);
		}
	}
	
	/*public static void extractedInteger(ArrayList<Integer> integerlist) {
		for(Integer temp :integerlist)
		{
			System.out.println(temp);
		}
	}*/
	
}
