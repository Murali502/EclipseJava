package testNgRest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class HeaderInAPI {
	
	//Headers are metadata associated with request and response of API
	//it may contain Authorization, cookies,body type, proxies,additional data for API for work
	//Request and response both can have associated headers
	// key - values pair 
	@Test
	public void passHeader()
	{
		RestAssured
		.given()
		.log()
		.all()
		.header("Header" , "Value1","Header" , "Value2")
	.when()
	.get();
	}

	@Test
	public void passHeader2()
	{
		RestAssured
		.given()
		.log()
		.all()
		.header("Header" , "Value1","Header" , "Value2")
		.header("Header" , "Value1","Header" , "Value2")
	.when()
	.get();
	}
	
	@Test
	public void passHeader3()
	{
		Header header = new Header("Header","Value1");
		RestAssured
		.given()
		.log()
		.all()
		.header(header)
		
	.when()
	.get();
	}
	
	@Test
	public void passHeaders4()
	{
		//Header header = new Header("Header","Value1");
		RestAssured
		.given()
		.log()
		.all()
		.headers("h1", "V1", "h2", "V2","h3", "V3")
		
	.when()
	.get();
	}
	
	@Test
	public void passHeadersmaP()
	{
		Map<String,String> mapHeaders= new HashMap<>();
		
		mapHeaders.put("h1", "V1");
		mapHeaders.put("h2", "V2");
		mapHeaders.put("h2", "V2");
		mapHeaders.put("h2", "V2");
		//Header header = new Header("Header","Value1");
		RestAssured
		.given()
		.log()
		.all()
		.headers(mapHeaders)
	.when()
	.get();
	}
}
