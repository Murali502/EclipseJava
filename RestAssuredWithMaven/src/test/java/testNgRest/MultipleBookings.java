package testNgRest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MultipleBookings {

	RequestSpecification requestsp;
	
	@BeforeClass
	public void setupbooking()
	{
		requestsp =RestAssured.given();
		requestsp
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.contentType(ContentType.JSON);
	}
	
	@Test
	public void createBooking1()
	{
		
		RestAssured
		.given()
		.spec(requestsp)
		.body("{\r\n" + 
				"\"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2021-12-12\",\r\n" + 
				"        \"checkout\" : \"2021-12-13\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		// Hit the request and get the response 
		.post()
		//Validate the response 
		.then()
		.log()
		.all().statusCode(200);
	}
	@Test
	public void createBooking2()
	{
		
		RestAssured
		.given()
		.spec(requestsp)
		.body("{\r\n" + 
				"\"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2021-12-12\",\r\n" + 
				"        \"checkout\" : \"2021-12-13\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		// Hit the request and get the response 
		.post()
		//Validate the response 
		.then()
		.log()
		.all().statusCode(200);
	}
}
