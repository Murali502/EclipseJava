package logicalPrograms;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // 		
		Clac1 obj =new Clac1();
		
		System.out.println(obj.num1);

	}

}

class Clac1
{
	int num1;
	int num2;
	int result;

	public Clac1()
	{
		num1=5;
		num2=5;
		System.out.println(" in constructor");
	}
	
	public Clac1(int n)
	{
		num1=n;
		num2=n;
	}
	
	public Clac1(double n)
	{
		num1=(int)n;
		num2=(int)n;
	}
}
