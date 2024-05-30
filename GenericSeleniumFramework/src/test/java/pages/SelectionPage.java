package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectionPage extends BaseWebPage {

	public SelectionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By pageHeader =By.xpath("");

public void verifyPageHeader()
{	
try {
	 getcommands().clickOnCenter(pageHeader);
}catch(Exception e)
{
	e.printStackTrace();
	throw e;
}
}

public void selectAwaiting() throws Exception
{
   try {
	   getcommands().click(pageHeader);
   }catch(Exception e) {e.printStackTrace(); throw e; }
}
}


//76750 83291