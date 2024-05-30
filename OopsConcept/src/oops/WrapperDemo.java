package oops;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5;
		Integer ii=new Integer(i);  //Boxing - Wrapping 
		int J=ii.intValue();
		
		int j=ii.intValue();  //unboxing - unwrapping 
		
		Integer value =i;  //AutoBoxing 
		
		int k =value; //Autounboxing  
		
		//String st="Murali";
		
		Integer str=Integer.valueOf("Murali");
		
		Integer v1=str.valueOf(str);
		System.out.println("String value" + v1);
		
		
	}

}
