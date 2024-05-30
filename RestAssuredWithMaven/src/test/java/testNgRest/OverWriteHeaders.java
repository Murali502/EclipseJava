package testNgRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class OverWriteHeaders {
	
	@Test
	public void passHeader()
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
	public void overWriteHeader()
	{
		RestAssured
		.given()
		.config(RestAssuredConfig.config()
				.headerConfig(HeaderConfig.headerConfig()
				.overwriteHeadersWithName("Header1", "Header")))
		.log()
		.all()
		.header("Header" , "Value1","Header" , "Value2")
		.header("Header" , "Value1","Header" , "Value2")
	.when()
	.get();
				
		
	}
	
}
