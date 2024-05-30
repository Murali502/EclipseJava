package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "Credentials")
  public void f(String Username, String Password,String Url) {
	  System.out.println("UserName "+Username+ "    " +"Password"+Password +"   "+Url);
  }

  
  @DataProvider(name="Credentials")
  public Object[][] getData() {
	   
	  Object[][] data =new Object[3][3];
	  
	  data[0][0]="Hyd";
	  data[0][1]="Blr";
	  data[0][2]="Blr";
	  
	  data[1][0]="NRC";
	  data[1][1]="DHL";
	  data[1][2]="Blr";
	  
	  data[2][0]="MP";
	  data[2][1]="AP";
	  data[1][2]="Blr";
    return data;
  }
}
