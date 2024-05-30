package restFullBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class ParamAndURLParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-------------------------------------Path pameter example using map --------------------------
 		Map<String,Object> pathparameters= new HashMap<>();
 		pathparameters.put("basePath", "booking");
 		pathparameters.put("bookingId", 2);
 		
		RestAssured
		.given().log().all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{bookingId}")
			/*.pathParam("basePath", "booking")
			.pathParam("bookingId", 2)*/
			.pathParams(pathparameters)
		.when()
			//.get()
		// unnamed parameters example
			.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",2)
		.then()
			.log()
			.all();
		
	}

}
