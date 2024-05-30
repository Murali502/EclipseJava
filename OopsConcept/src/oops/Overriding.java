package oops;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj1 = new C();
		obj1.show();
	}

}

class C
{
	 public void show()
	   {
		   System.out.println("In C");
	   }
}

class D extends C
{
	public void show()
	   {
		 //  super.show();
		   System.out.println("In D");
	   }
}
