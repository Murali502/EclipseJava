package jsonExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonDemo {
	
	@Test
	public void JsonPathDemo()
	{
		
		String json="{\r\n" + 
				"\"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
	              "}";
		
		JsonPath jsonpath = new JsonPath(json);
		String value=jsonpath.getString("firstname");
		
		System.out.println("First name "+value);
		
		JsonPath fnamen = new JsonPath(json);
		Object fname=fnamen.get("firstname");
		
		System.out.println("Second value "+value);
		
	}

}
