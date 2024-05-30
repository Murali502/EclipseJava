package sorting;

import java.util.ArrayList;
import java.util.Collections;

import myUtility.Myutilities;

public class StringSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strlist =new ArrayList<>();
		
		strlist.add("Zara zara");
		strlist.add("besabriayadd");
		strlist.add("kaise hua");
		strlist.add("aeisa nauea");
		strlist.add("annnn dfdfdf");
		strlist.add("cnes adferr");
		//iteratList(strlist);
		Collections.sort(strlist);
	    Myutilities.iteratListString(strlist);
	}

	

}
