package testNg;

import org.testng.annotations.Test;

//What is attribute
//Attributes are used to add more flexibility and customization to the execution flow of test methods ,we have attributes of @Test annotation
/*
 *  DependsOnMethods
 *  Priority 
 *  Enabled
 *  Groups
 *  dataProvider 
 */
 

public class Attributes {
	
  @Test(enabled =false)
  public void login() {
  
	  System.out.println("login");
  }
  
  @Test(dependsOnMethods ="login")
  public void dashboard() {
  
	  System.out.println("dashboard");
  }
  
  @Test(dependsOnMethods = {"login","dashboard"})
  public void logout() {
  
	  System.out.println("logout");
  }
}
