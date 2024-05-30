package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends pages{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	

	public void doClick(By locator)
	{
		driver.findElement(locator).click();
	}
	
	/*public void sendKeys()
	{
		
	}*/
}
