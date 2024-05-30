package jsonExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class NestedJsonDemo {

	
	@Test
	public void nestedJson()
	{
		
		String jsonPath ="{\r\n" + 
				"  \"firstname\": \"murali\",\r\n" + 
				"  \"lastname\": \"golla\",\r\n" + 
				"  \"age\": 24,\r\n" + 
				"  \"address\": {\r\n" + 
				"    \"flatno\": 24,\r\n" + 
				"    \"StreetAddress\": \"Yelahanka\",\r\n" + 
				"    \"LandMark\": \"Bagalur\",\r\n" + 
				"    \"Pin\": 560061\r\n" + 
				"  },\r\n" + 
				"  \"salary\": 10.5,\r\n" + 
				"  \"married\": \"yes\"\r\n" + 
				"}";
		
		
		JsonPath path = new JsonPath(jsonPath);
		int FlatNo =path.getInt("address.flatno");
		System.out.println(FlatNo);
		
	}
}
