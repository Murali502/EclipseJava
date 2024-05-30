package jsonExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonObjectExamples {

	
	@Test
	public void JsonPathDemo()
	{
	
	String jsonObject = "{\r\n" + 
			"    \"firstname\" : \"Jim\",\r\n" + 
			"    \"lastname\" : \"Brown\",\r\n" + 
			"    \"totalprice\" : 111,\r\n" + 
			"    \"depositpaid\" : true,"+"}";
	
	JsonPath jspath = new JsonPath(jsonObject);
	String value=jspath.getString("firstname");
	
	System.out.println("First name "+value);
	
	}
	
}
