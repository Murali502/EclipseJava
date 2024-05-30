package helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.sukgu.Shadow;

public class ShadowDomHelper {
	
	WebDriver driver;
	//WebCommands commands;
	Shadow shadow;
	public ShadowDomHelper(WebDriver driver)
	{
		
		this.driver=driver;
		this.shadow = new Shadow(driver);
	}
	

	public void wait(String cssSelector)
	{
		
		List<WebElement> element = shadow.findElements(cssSelector);
		for(int i =0; i<5;i++)
		{
			if( element.size()==0)
			{
				element = shadow.findElements(cssSelector);
			}
			else
			{
				return;
			}
			throw new RuntimeException("Element with " + cssSelector + "not found");
		}
	}
	
	
	public WebElement getElement(String cssSelector)
	{
		
		WebElement element =shadow.findElement(cssSelector);
		return element;
	}
	
	public List<WebElement> getElements(String cssSelector)
	{
		
		List<WebElement> element =shadow.findElements(cssSelector);
		return element;
	}
  
	public String getText(String cssSelector, String expectedText)
	{
		
		WebElement elementmatchingText=getElements(cssSelector).stream().filter(element -> element.getText()
				.contains(expectedText)).findFirst().orElse(null);
		return expectedText;
		
	}
}
