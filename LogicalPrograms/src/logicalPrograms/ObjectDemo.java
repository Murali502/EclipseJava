package logicalPrograms;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clac obj =new Clac();
		obj.num1=3;
		obj.num2=5;
	    obj.perform();
	}
	

}

class Clac
{
	int num1;
	int num2;
	int result;

	public void perform()
	{
		result =num1+num2;
		System.out.println("Addition of two numbers" + result);
	}
}