package Put;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.restassured.response.Response;


public class PutRequest1 extends TestBase {
	
	/*
	 1)I will get a data before updating
	 2)I will update the data
	 3)I will get the data to see if it is updated or not
	*/
	
	/*
	 For PUT Request we need;
	 1)Endpoint
	 2)Request body
	*/
	
	@Test
	public void put01() {
		//spec01.pathParam("id", 198);
		//1)I will get a data before updating
		Response response = given().
				               spec(spec01).
				            when().
				               get("/198");
		response.prettyPrint();
		
		//2)I will update the data
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("userId", 33);
		reqBody.put("title", "Ercan opsun seni suleyman Alptekin ");
		reqBody.put("completed", false);
		
		Response putResponse = given().
				                   spec(spec01).
				                   body(reqBody.toString()).
				               when().
				                   put("/198");
		putResponse.prettyPrint();
		
		//Assert the status code
		response.
		     then().
		     assertThat().
		     statusCode(200);
	
	}

}