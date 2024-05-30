package testDemo;

import org.testng.annotations.Test;


public class Maventest {
	@Test
	public void sum()
	{
		
		int i=40+20;
		System.out.println("sum of two numbers" +i);
	}
	
	@Test
	public void sub()
	{
		
		int j=40-20;
		System.out.println("substraction two numbers" +j);
	}
	
	@Test
	public void mul()
	{
		int j=40*20;
		System.out.println("Multiplication two numbers" +j);
	}

}
