package oops;

//The super keyword can also be used to invoke the parent class constructor
public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 d=new Dog4();  
	}

}
class Animal4{  
Animal4()
{
	System.out.println("animal is created");
	
}  
}

class Dog4 extends Animal4{  
Dog4()
{  
super();  
System.out.println("dog is created");  
}  
} 
