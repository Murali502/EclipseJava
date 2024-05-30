package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pages.pages;

public class BaseTest {

	
	public WebDriver driver;
	public WebDriverWait wait;
	public pages page;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("", "");
		driver= new ChromeDriver();
		wait = new WebDriverWait(driver,15);
		driver.manage().window().fullscreen();
		page =new pages(driver,wait);
		
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
	

	
}
