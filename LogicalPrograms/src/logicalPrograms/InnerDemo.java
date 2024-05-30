package logicalPrograms;

public class InnerDemo {

	//variables, ,method
	//Member class
	//static class
	//Anonymous class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer obj= new Outer();
       obj.show();
       Outer.inner innerobj = obj.new inner();
	   innerobj.display();
	}

}


class Outer
{

	int a;
	public void show()
	{
		
	}
	
	class inner
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
	
}
