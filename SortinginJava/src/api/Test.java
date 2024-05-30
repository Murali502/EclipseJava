package api;

public class Test {
	
	public static <T> void printInfo(T anyObj)
	{
		System.out.println("Hey you are a human/Dog /bird");
	}
	
	public static void main(String[] args)
	{
		printInfo(new Human());
		
	}

}

class Human 
{
	
}

class Doctor extends Human
{
	

}

class Animal
{
	
}


class Dog extends Animal
{
	

}

class Bird
{
	
}