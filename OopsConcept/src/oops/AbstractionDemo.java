package oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Kit k =new Kit();
           Writer p=new Pen();
           Writer pc=new Pencil();
           
           k.doSomething(pc); 
	}

}


class Pen extends Writer
{

	public void write()
	{
		System.out.println("In a Pen");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("In a Pencil");
	}
}
class Kit 
{
public void doSomething(Writer p)
{
  	p.write();
}
	
}

abstract class Writer
{
	public abstract void write();
}

