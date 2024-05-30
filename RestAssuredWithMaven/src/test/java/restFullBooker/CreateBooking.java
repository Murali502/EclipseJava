package restFullBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Build Request 
		RequestSpecification requestsp=RestAssured.given().log().all();
		requestsp.baseUri("https://restful-booker.herokuapp.com/");
		requestsp.basePath("booking");
		requestsp.body("{\r\n" + 
				"\"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2021-12-12\",\r\n" + 
				"        \"checkout\" : \"2021-12-13\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}");
		requestsp.contentType(ContentType.JSON);
		
		//Hit Request and get Response 
	Response response =	requestsp.post();
  // Validate the response 
	ValidatableResponse validres=response.then().log().all();
	validres.statusCode(200);
	}

}
