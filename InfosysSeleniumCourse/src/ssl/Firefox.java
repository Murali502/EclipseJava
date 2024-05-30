package ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Firefox {
	
	//@SuppressWarnings("deprecation")
	@Test
	@SuppressWarnings("deprecation")
	public void desirecabilities()
	{
		ProfilesIni prof =new ProfilesIni();
		FirefoxProfile ffprofile =prof.getProfile("Selenium");
		ffprofile.setAcceptUntrustedCertificates(true); 
		ffprofile.setAssumeUntrustedCertificateIssuer(false);

		WebDriver driver =new FirefoxDriver(ffprofile);
		
	}
	
	@Test
	public void chormssl()
	{
		DesiredCapabilities handlssl= DesiredCapabilities.chrome();
		handlssl.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver chromeDriver=New ChromeDriver(handlssl);
	}
	
	@Test
	public void Iessl()
	{
		DesiredCapabilities handssl=DesiredCapabilities.internetExplorer();
		handssl.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver iedriver=new InternetExplorerDriver(handssl);
		
	}

}
