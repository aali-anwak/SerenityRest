package TestSteps;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;

public class StepsClass {
	
	@Title("Get all the users from API")
	@Step("Getting all the users...")
	public void getAllTheUsersStepsClass()
	{
		Response res=SerenityRest.given().baseUri("https://reqres.in").basePath("api/users").get();
		res.prettyPrint();
		
		res.then().statusCode(200);
		//res.then().body("data.first_name", Matchers.equalTo("Eve"));
			
	}
	
	@Title("'Post a request to verify the response code: rescode{0}")
	@Step("'Post a request to verify the response code: rescode{0}")
	public void postARequestStepsClass(String email, String first_name,String last_name)
	{
		
		String payload="{\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"id\": 2,\r\n"
				+ "        \"email\": \"+janet.weaver@reqres.in+\",\r\n"
				+ "        \"first_name\": \"Janet\",\r\n"
				+ "        \"last_name\": \"Weaver\",\r\n"
				+ "        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    \"support\": {\r\n"
				+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
				+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("email", email);
		map.put("first_name", first_name);
		map.put("last_name", last_name);
		
	Response res=SerenityRest.given().baseUri("https://reqres.in").basePath("api/users")
			.contentType(ContentType.JSON).body(map).post();
	System.out.println("The response code is as:- "+res.getStatusCode());
	
	res.then().statusCode(201);
}
	
	@Step("Deleting the user id: userId{0}")
	public void deleteRequestStepsClass(String userId)
	{
		Response res=SerenityRest.given().baseUri("https://reqres.in").basePath("api/users")
				.when().delete(userId);
		res.prettyPrint();
		
		res.then().statusCode(204);
		//res.then().body("data.first_name", Matchers.equalTo("Eve"));
			
	}

}
