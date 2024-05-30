package pages;

import org.openqa.selenium.WebDriver;

import io.github.sukgu.Shadow;
import webautomation.WebCommands;

public class BaseWebPage {
	WebDriver driver;
	public BaseWebPage(WebDriver driver) {this.driver=driver;}
	
	protected WebCommands getcommands() {return new WebCommands(driver);}
	
	protected Shadow getShadow() { return new Shadow(driver);}
	
	//protected ShadowWrapper getShadowCommands() {}

	public void captureScreenAndattachToReport() {
		
		//String screenshotBase64=getcommands().
	}
}
