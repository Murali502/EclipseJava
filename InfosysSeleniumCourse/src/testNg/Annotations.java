package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("This method is: Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This method is: @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This method is: @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This method is: @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This method is: @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This method is: @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This method is: @AfterTest");
  }

  //To setup and start Selenium driver instances
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This method is: @BeforeSuite");
  }
  
//To Stop Selenium driver instances 
  @AfterSuite
  public void afterSuite() {
	  System.out.println("This method is: @AfterSuite");
  }

}
