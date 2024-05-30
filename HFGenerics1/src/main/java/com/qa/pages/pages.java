package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pages {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public pages(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}

	public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass)
	{
		try
		{
			return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
		}
		catch(Exception c)
		{
		  c.printStackTrace();
		  return null;
		}
		
	}
}
