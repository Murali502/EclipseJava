package oops;

//super can be used to refer immediate parent class instance variable.

public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		d.printColor();  
	}

}

class Animal{  
String color="white";  
} 

class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  