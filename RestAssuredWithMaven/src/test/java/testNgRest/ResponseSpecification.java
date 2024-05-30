package testNgRest;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ResponseSpecification {

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
		
		io.restassured.specification.ResponseSpecification responsespecification=RestAssured.expect();
		responsespecification.statusCode(200);
		responsespecification.contentType(ContentType.JSON);
		responsespecification.time(Matchers.lessThan(5000L));
		
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
		.all()
		.spec(responsespecification);
		/*.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(5000L));*/
	}
}
