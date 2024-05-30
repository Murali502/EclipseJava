package testNg;

import org.testng.annotations.Test;

public class Groups {
 /* @Test(groups= {"car","ecar"})
  public void car() {
	  System.out.println("Car");
  }
  
  @Test(groups={"car","sedan"})
  public void car1() {
	  System.out.println("Car1");
  }*/
  
  @Test
  public void vehicle() {
	  System.out.println("vehicle");
  }
  @Test
  public void vehicle_car() {
	  System.out.println("vehicle_car");
  }
  @Test
  public void vehicle_bike() {
	  System.out.println("vehicle_bike");
  }
  @Test
  public void Automobile_vehicle() {
	  System.out.println("Automobile_vehicle");
  }
}
