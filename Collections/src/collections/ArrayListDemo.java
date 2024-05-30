package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		ArrayList<JavaDev> javaDemo=new ArrayList<JavaDev>();
		javaDemo.add(new JavaDev("Nainika","India","Fresher"));
		javaDemo.add(new JavaDev("Shreyas","India","Exp"));
		javaDemo.add(new JavaDev("Murali","India","Fresher"));
		
		javaDemo.add(new JavaDev("Leela","India","Fresher"));
		System.out.println(javaDemo);
		javaDemo.add(new JavaDev("Balaji","India","Fresher"));
		
		
		
		Map<Integer, JavaDev> hm = new HashMap<Integer, JavaDev>(); 
		hm.put(1,new JavaDev("Murali","India","Fresher"));
		hm.put(2,new JavaDev("Nainika","India","Fresher"));
		hm.put(3,new JavaDev("Leela","India","Fresher"));
		hm.put(4,new JavaDev("Shreyas","India","Fresher"));
		hm.put(5,new JavaDev("Balaji","India","Fresher"));
		
		System.out.println(hm);
		
		
		
	}

}
