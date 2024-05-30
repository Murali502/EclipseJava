package company.com.utilities;



import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CookieHelper {

	
	
	private static String OBSSOURL ="";
	private static String OAUTHURL_PROD= "";
	
   private static Response response;
   
   
   public String generateOBSSOCookie(String username,String password)
   {
	  try {
		  RestAssured.baseURI ="";
		  RequestSpecification request = RestAssured.given();
		  response =request.contentType(ContentType.URLENC)
				  .body("userId="+username+"&Password="+password)
				  .post(OBSSOURL);
				  
		  return response.asString();
	  }catch(Exception e) {
		  throw new AssertionError("Something went wrong while generating cookie\n" + e.getMessage());
	  }
	   
	
   }
	
   public String generateOAuthTokenProd(String username,String password)
   {
	   try {
			  RestAssured.baseURI ="";
			  RequestSpecification request = RestAssured.given();
			  response =request.contentType(ContentType.URLENC)
					  .body("userId="+username+"&Password="+password)
					  .post(OAUTHURL_PROD);
					  
			  return response.jsonPath().get("access_token");
		  }catch(Exception e) {
			  throw new AssertionError("Something went wrong while generating cookie\n" + e.getMessage());
		  }
	 
   }
   
   public String generateOAuthoTokenSharepoint(String pathUrl,Map<String,String> headers)
   {
	   
	   RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
	   JSONObject jsonResponse = null;
	   
	   try {
		   reqSpecBuilder.setBaseUri("");
		   reqSpecBuilder.setContentType(ContentType.URLENC);
		   
		   for (String  header : headers.keySet()) {
			   reqSpecBuilder.addFormParam(header,headers.get(header));
		}
		   RequestSpecification requestSpecification = reqSpecBuilder.build();
		   response = RestAssured.given().spec(requestSpecification).relaxedHTTPSValidation().post(pathUrl);
		   jsonResponse=(JSONObject)JSONValue.parse(response.asString());
		   if(jsonResponse.get("access_token")!=null) {
			   return (String)jsonResponse.get("access_token");
		   }else {
			   return "";
		   }
		   
	   }catch(Exception e)
	   {
		   throw new AssertionError("Something went wrong while generating generateOAuthoTokenSharepoint\n" + e.getMessage());
	   }
	   
   }
   
}
