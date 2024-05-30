package oops;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		B obj1 =new B(5);
	}

}
class A
{
   public A()
   {
	   System.out.println(" in A");
   }
   public A(int i)
   {
	   System.out.println(" in A int");
   }
}

class B extends A
{
   public B()
   {
	   System.out.println(" in B");
   }
   public B(int j)
   {
	   super(j);
	   System.out.println(" in B int");
   }
}

