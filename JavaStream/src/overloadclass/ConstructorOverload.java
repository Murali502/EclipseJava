package overloadclass;

public class ConstructorOverload {

	
	public static void m1()
	{
	System.out.println("m1 method");
	m2();
	}
	public static void m2()
	{
	System.out.println("m2 method");
	m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
