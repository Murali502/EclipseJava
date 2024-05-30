package company.com.utilities;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Girish
 *
 */

public class GenericsMethodsApi {
	
	public String uri;
	public String url;
	public static Response response;
	public static RequestSpecification request;
	public static Map<String,String> responseValues = new HashMap<String,String>();
	
	
	public String getUri() {
		return uri;
	}
	
	public String setUri(String uri)
	{
		return this.uri = uri;
	}
	
  public String getUrl()
  {
	  return url;
  }
  
  public void setUrl(String url) {
	  this.url=url;
  }
  
  /**--
 * @param oAuthToken
 * @param xapikey
 * @param uriPath
 * @return
 */
public String getRequestOAuth(String oAuthToken,String xapikey,String uriPath)
  {
	   try {
			  RestAssured.baseURI ="";
			  RequestSpecification request = RestAssured.given();
			  response =request.contentType(ContentType.JSON)
					   .header("Authorization" , "Bearer "+oAuthToken)
					   .header("x-api-key",xapikey)
					   .get(uriPath);
					  
			  return response.asString();
		  }catch(Exception e) {
			  throw new AssertionError("Something went wrong while generating cookie\n" + e.getMessage());
		  }
	 
  }



/**
 * @param contentType
 * @param uriPath
 * @param headers
 * @return
 */
public Response get(ContentType contentType,String uriPath,Map<String,String> headers)
{
  RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
	try {
		
		reqBuilder.setBaseUri(getUri());
		reqBuilder.setContentType(contentType);
		for (String header : headers.keySet()) {
			
			reqBuilder.addHeader(header, headers.get(header));
			
		}
		RequestSpecification reqSpecification = reqBuilder.build();
		
		response = RestAssured.given().spec(reqSpecification).relaxedHTTPSValidation().get(uriPath);
		return response;
	}catch(Exception e) {
		throw new AssertionError("Something went wrong while generating cookie\n" + e.getMessage());
	}
}


/**
 * @param contentType
 * @param uriPath
 * @param headers
 * @return
 */
public Response post(ContentType contentType,String uriPath,Map<String,String> headers,String payload)
{
  RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
	try {
		
		reqBuilder.setBaseUri(getUri());
		reqBuilder.setContentType(contentType);
		for (String header : headers.keySet()) {
			
			reqBuilder.addHeader(header, headers.get(header));
			
		}
		reqBuilder.setBody(payload);
		RequestSpecification reqSpecification = reqBuilder.build();
		
		response = RestAssured.given().spec(reqSpecification).relaxedHTTPSValidation().post(uriPath);
		return response;
	}catch(Exception e) {
		throw new AssertionError("Something went wrong while generating cookie\n" + e.getMessage());
	}
}


}