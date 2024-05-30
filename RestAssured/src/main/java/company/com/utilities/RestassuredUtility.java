package company.com.utilities;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RestassuredUtility {

	
	static RequestSpecification requestSpec;
	static Response response;
	
	public RequestSpecification requestSpecificatin(String baseURI)
	{
		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI).setContentType(ContentType.JSON).build();
		
		return requestSpec;
	}
	
	public RequestSpecification requestSpecificatin(String baseURI,String key,String value)
	{
		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI).setContentType(ContentType.JSON).addQueryParam(key, value).build();
		
		return requestSpec;
	}
	
	public RequestSpecification requestSpecificatin(String baseURI,Map<String,Object> queryParams)
	{
		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI).setContentType(ContentType.JSON).addQueryParams(queryParams).build();
		
		return requestSpec;
	}
	
	
	public static Response getRequest(RequestSpecification request,String resource,String bearerToken)
	{
		
		request = given().log().all().spec(request).header("Authorization","Bearer" + bearerToken);
		response = request.when().get(resource);
		return response;
	}
	
	public static Response postRequest(RequestSpecification request,String resource,JSONObject jsonObject,String bearerToken,String api_key,ExtentTest extenttest)
	
	{
		String body = null;
		request = given().spec(request).
				header(Constants.AUTHORIZATION,"Bearer "+bearerToken)
				.header(Constants.X_API_KEY,api_key).body(body);
		
		response =request.when().post(resource);
		response.then().statusCode(200);
		return response;
		
	}
	
	public RequestSpecification requestSpecificatin(String baseURI,JSONObject jsonObject)
	{
		Map<String,Object> queryParams = new HashMap<>();
		
		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI).setContentType(ContentType.JSON).addQueryParams(queryParams).build();
		return requestSpec;
	}
	
}
