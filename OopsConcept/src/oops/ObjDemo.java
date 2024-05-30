package oops;

public class ObjDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Overriding  s2=(Overriding) Class.forName("Overriding").newInstance();
		
	    Overriding s3=Overriding.class.newInstance();
	}
 
	
	// Creating object using new instance method of class 
	
}
