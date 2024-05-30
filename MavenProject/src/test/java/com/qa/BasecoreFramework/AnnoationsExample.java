package com.qa.BasecoreFramework;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.qameta.allure.Description;

public class AnnoationsExample {

	public static ExtentReports reporter;
	
	public static WebDriver driverthread;
	static Dictionary dict=new Hashtable();
	static Dictionary dicttoread=new Hashtable();
	public Properties prop;
	public String mainwindow;
	public static ExtentTest logger;
	public static String MainWindow;
	
	@Test
	@Description("Some detailed test description")
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
