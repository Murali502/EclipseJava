package restFullBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
	
		RequestSpecification requestsp=RestAssured.given();
		requestsp.baseUri("https://restful-booker.herokuapp.com/");
		
		requestsp.basePath("booking/{id}");
		requestsp.pathParam("id", 1);
		 Response resp=requestsp.get();
		 
		 ValidatableResponse validres=resp.then().log().all();
		 validres.statusCode(200);
		
	}
	
}
