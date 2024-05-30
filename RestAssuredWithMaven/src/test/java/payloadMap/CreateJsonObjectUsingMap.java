package payloadMap;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateJsonObjectUsingMap {

	
public static void main(String[] args) {

  Map<String,String> JsonMap = new HashMap<>();
  JsonMap.put("firstname", "murali");
  JsonMap.put("lastname", "golla");
  JsonMap.put("address", "BNR");
  JsonMap.put("city", "Bangalore");
  JsonMap.put("State",  "KA");
  
  
  /*RestAssured
  		.given()
  		.log()
  		.all()
  		.body(JsonMap)
  		.get();*/
  System.out.println(JsonMap);
  
}
	
}
