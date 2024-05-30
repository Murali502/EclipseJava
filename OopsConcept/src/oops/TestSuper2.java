package oops;

//super can be used to invoke parent class method 
public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();  
		d.work();  
	}

}
class Animal1{  
void eat(){System.out.println("eating...");}  
}

class Dog1 extends Animal1{  
void eat()
{
	System.out.println("eating bread...");
}  
void bark()
{
	System.out.println("barking...");
}  
void work()
{  
super.eat();  
bark();  
}  
}  