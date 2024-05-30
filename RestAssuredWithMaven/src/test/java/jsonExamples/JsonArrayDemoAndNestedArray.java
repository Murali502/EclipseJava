package jsonExamples;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonArrayDemoAndNestedArray {
	
	/*@Test
	public void JsonArrayDemo()
	{
		String jsonObject ="[\r\n" + 
				"  \"10\",\r\n" + 
				"  \"20\",\r\n" + 
				"  \"30\",\r\n" + 
				"  \"40\",\r\n" + 
				"  \"50\"\r\n" + 
				"]";
		
		JsonPath path = new JsonPath(jsonObject);
		System.out.println(path.getString("[0]"));
		System.out.println(path.getList("$").size());
		
			}*/
	
	@Test
	public void JsonArrayDemo2()
	{
		String jsonObject ="[[\r\n" + 
				"  \"10\",\r\n" + 
				"  \"20\",\r\n" + 
				"  \"30\",\r\n" + 
				"  \"40\",\r\n" + 
				"  \"50\"\r\n" + 
				"],\r\n" + 
				"[\r\n" + 
				"  \"100\",\r\n" + 
				"  \"200\",\r\n" + 
				"  \"300\",\r\n" + 
				"  \"400\",\r\n" + 
				"  \"500\"\r\n" + 
				"]\r\n" + 
				"]";
		
		JsonPath path = new JsonPath(jsonObject);
		System.out.println(path.getString("[1][1]"));
		System.out.println(path.getList("$").size());
		
	    List<Object> internalObject=(List<Object>)path.getList("$").get(0);
	    System.out.println(internalObject.size());
	    
		
			}

}
