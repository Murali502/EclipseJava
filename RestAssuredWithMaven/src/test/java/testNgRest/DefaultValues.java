package testNgRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DefaultValues {

	@Test
	public void defaultvalues()
	{
		// Build Request 
				RestAssured
				.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
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
				.contentType(ContentType.JSON)
				// Hit the request and get the response 
				.post()
				//Validate the response 
				.then()
				.log()
				.all().statusCode(200);
			}

	}