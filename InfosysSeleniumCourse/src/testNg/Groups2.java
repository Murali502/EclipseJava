package testNg;

import org.testng.annotations.Test;

public class Groups2 {
  @Test(groups= {"bike","ebike"})
  public void bike() {
	  System.out.println("Bike");
  }
  
  @Test(groups={"bike"})
  public void bike1() {
	  System.out.println("Bike1");
  }
  
  @Test(groups={"bike"})
  public void bike2() {
	  System.out.println("Bike2");
  }
}
