package payloadMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DynamiJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<String,Object> obj = new HashMap<>();
		
		/*Response respone=RestAssured.get("https://run.mocky.io/v3/d30042c7-6eef-4fa6-8d2c-c3cddfac2db6");
		
		Map dynamicMap=respone.as(Map.class);
		System.out.println(dynamicMap.keySet());*/
		
        /*Response respone=RestAssured.get("https://run.mocky.io/v3/d30042c7-6eef-4fa6-8d2c-c3cddfac2db6");
		
        List dynamicList=respone.as(List.class);
		System.out.println(dynamicList.size());*/
		
		
		 Response respone=RestAssured.get("https://run.mocky.io/v3/d30042c7-6eef-4fa6-8d2c-c3cddfac2db6");
		
		Object obj1= respone.as(Object.class);
			
		if(obj1 instanceof List)
		{
			List dynamicList= (List)obj1;
			System.out.println(dynamicList.size());
		}
		else if(obj1 instanceof Map)
		{
			Map dynamicList= (Map)obj1;
			System.out.println((Map)dynamicList.keySet());
		}
		
	}

}
