package restFullBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RefactorGetBooking2 {

	public static void main(String[] args) {
	
		RestAssured
	.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/{id}")
		.pathParam("id", 1)
	.when()	
		.get()
	.then()
	    .log()
	    .all()
		.statusCode(200);
		
	}
	
}
