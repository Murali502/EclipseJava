package webautomation;

import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class WebCommands {

	private WebDriver a;
	private WebDriverWait b;
	private ShadowDOM c;
	
	public WebCommands(WebDriver var1)
	{
		this.a=var1;
		this.b=new WebDriverWait(var1,45L);
		this.c=new ShadowDOM(var1);
	}
	
	public WebDriver getDriver() {return this.a;}
	
	public ShadowDOM shadowDOM() {return this.c;}
	
	public void click(By var1) throws Exception
	{
		try {
			
			this.a.findElement(var1).click();
		}catch(StaleElementReferenceException var2)
		{
			this.forceWait(1);
			this.a.findElement(var1).click();
		}catch(Exception var3)
		{
			System.out.println("Cannot click on element");
			throw var3;
		}
	}
	
	public void forceWait(int var1)
	{
		try {
			
			Thread.sleep((long)(var1*1000));
		}catch (Exception var2) {}
		
	}
	
	public void failSafeClick(By var1)
	{
		try {
			this.a.findElement(var1).click();
			
		}catch(StaleElementReferenceException var2)
		{
			this.forceWait(1);
			this.a.findElement(var1).click();
		}catch(ElementClickInterceptedException var3)
		{
			clickByJs(var1);
		}	
	}
	
	
	public void failSafeClick(WebElement var1)
	{
		try {
			var1.click();
			
		}catch(StaleElementReferenceException var2)
		{
			this.forceWait(1);
			var1.click();
		}catch(ElementClickInterceptedException var3)
		{
			this.clickByJs(var1);
		}	
	}
	
	public void click(By var1,int var2)
	{
		int var3=0;
	    while(var3<var2)
	    {
	    	try {
	    		this.click(var1);
	    		return;
	    	}catch(Exception var4)
	    	{
	    		this.forceWait(1);
	    		++var3;
	    	}
	    }
		
	}
	
	public void waitAndClick(By var1)
    { 
		try {
    	this.waitForElementVisible(var1);
    	this.a.findElement(var1).click();
		}catch(Exception var3)
		{
			System.out.println("Couldn't click on element" + var1);
			var3.printStackTrace();
			throw var3;
		}
		
    }
	
	public boolean retryFindClick(By var1)
	{
		boolean var2 =false;
		int var3=0;
		
		while(var3<2)
		{
			try {
				this.a.findElement(var1).click();
				var2=true;
				break;
			}catch(StaleElementReferenceException var4)
			{
				++var3;
			}
		}
		return var2;
		
	}
	
	public void moveToDefaultContent() {this.a.switchTo().defaultContent();}
	
	public void maximizeScreen() {this.a.manage().window().maximize();}
	
	/*public WebElement fluentWait(By var1,long var2) {
		return(WebElement)(new FluentWait(this.a)).withTimeout(20,TimeUnit.SECONDS).pollingEvery(200L, TimeUnit.SECONDS)
				.until(new a(this,var1));
	}*/
	
	
	public void checkPageIsReady()
	{
		JavascriptExecutor var1;
		if((var1=(JavascriptExecutor)this.a).executeScript("return document.readyState",new Object[0]).toString().equals("complete"))
		{
			System.out.println("Page is loaded");
		}else 
		{
			for(int var2 =0;var2<25;++var2)
			{
				try {
					Thread.sleep(1000L);
				}catch(InterruptedException var3) {
			}
			if((var1=(JavascriptExecutor)this.a).executeScript("return document.readyState",new Object[0]).toString().equals("complete"))
			{
				System.out.println("Page is loaded");
				return;
			}
		}
			
	}
}

	public void waitForElementVisible(By var1)
	{
		this.b.until(ExpectedConditions.visibilityOfElementLocated(var1));
		this.highlight(var1);

	}

	public void highlight(By var1)
	{
		((JavascriptExecutor)this.a).executeScript("arguments[0].style.border='3px solid red';", new Object[] {this.a.findElement(var1)});
	}
	
	public void clickByJs(By var1)
	{
		try {
			
			((JavascriptExecutor)this.a).executeScript("arguments[0].click();", new Object[] {var1});
		}catch(Exception var3) {}
		
	}
	
	public void clickByJs(WebElement var1)
	{
		try {
			
			((JavascriptExecutor)this.a).executeScript("arguments[0].click();", new Object[] {var1});
		}catch(Exception var3) {}
		
	}
	
	
	public void waitForElementNotVisible(By var1,String var2)
	{
		try {
			
			(new WebDriverWait(this.a,30L)).until(ExpectedConditions.invisibilityOfElementLocated(var1));
			this.highlight(var1);
		}catch(Exception var3) {}
	}
	
	public void clickOnCenter(By var1)
	{
		WebElement var4;
		int var2 =(var4=this.a.findElement(var1)).getSize().getWidth();
		(new Actions(this.a)).moveToElement(var4).moveByOffset(var2/2, 0).click().perform();;
	}
	
	public void executeJS(String var1)
	{
		((JavascriptExecutor)this.a).executeScript(var1, new Object[0]);
	}
	
	
	/*public boolean waitAcceptJsAlert()
	{
		boolean var1 = false;
		try {
			(new WebDriverWait(this.a, 5L)).
			
			
		}
		
	}*/
	
	public static boolean isAlertPresent(WebDriver var0)
	{
		try {
			var0.switchTo().alert();
			return true;
		}catch(NoAlertPresentException var1) {return false;}
	}
	
	
	public void handleAuthenticationPopup()
	{
		if(isAlertPresent(this.a))
		{
			this.a.switchTo().alert().sendKeys("Murli" + Keys.PAGE_UP + "Password");
			this.a.switchTo().alert().accept();
		}
		
	}
	
	public boolean handleAuthenticationPopup1()
	{
		try {
			Thread.sleep(3000L);
			this.a.switchTo().alert();
			Robot var1;
			
			(var1 = new Robot()).keyPress(65);
			var1.keyPress(85);
			var1.keyPress(82);
			var1.keyPress(92);
			var1.keyPress(80);
			var1.keyPress(55);
			var1.keyPress(57);
			var1.keyPress(53);
			var1.keyPress(85);
			var1.keyPress(55);
			var1.keyPress(52);
			var1.keyPress(52);
			var1.keyPress(9);
			var1.keyPress(20);
			var1.keyPress(76);
			var1.keyPress(65);
			var1.keyPress(73);
			var1.keyPress(83);
			var1.keyPress(72);
			var1.keyPress(512);
			var1.keyPress(51);
			var1.keyPress(49);
			var1.keyPress(56);
			
			
		}catch(Exception var2) { var2.printStackTrace();}
		return false;
	}
	
	public void waitAndSwitchToFrame(By var1)
	{
		this.b.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(var1));
	}
	
	public void switchToFrame(By var1)
	{
		
		this.a.switchTo().frame(this.a.findElement(var1));
	}
	
	public void switchTowindow(String var1)
	{
		Iterator var2 = this.a.getWindowHandles().iterator();
		
		while(var2.hasNext())
		{
			String var3 =(String) var2.next();
			this.a.switchTo().window(var3);
			System.out.println("URLs:  " + this.a.getCurrentUrl());
			
			if(this.a.getCurrentUrl().contains(var1))
			{
				break;
			}
			
		}
		
	}
	
	public int numberofOpenedWindows() {return this.a.getWindowHandles().size();}
	
	public void type(By var1,String var2)
	{
		try {
			
			this.a.findElement(var1).sendKeys(new CharSequence[] {var2});
		} catch (Exception var3)
		{
			var3.printStackTrace();
		}
		
	}
	
	public void scrollToMiddleofPage() {this.executeJS("window.scrollBy(0,250)");}
	
	public void scrollIntoView(By var1)
	{
		WebElement var2 = this.a.findElement(var1);
		((JavascriptExecutor)this.a).executeScript("arguments[0].scrollIntoView(true);", new Object[] {var2});
		
	}
	
}



