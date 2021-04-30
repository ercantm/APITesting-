package Post;
import org.json.JSONObject;
import org.junit.Test;



import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class PostRequest04 extends TestBase  {
	@Test
	public void post01() {
		
		//If an API does not let you to create a new data you will get 404, 405 status code
		/*
		 {
            "id": "17",
            "employee_name": "Paul Byrd",
            "employee_salary": "725000",
            "employee_age": "64",
            "profile_image": ""
         }
		*/
		
		JSONObject  body= new JSONObject();
		
		body.put("employee_name","Paul Byrd");
		body.put("employee_salary","725000");
		body.put( "employee_age", "64");
		body.put( "profile_image", "");
		
		
//		JSONObject reqBody = new JSONObject();
//		reqBody.put("id", "17");
//		reqBody.put("employee_name", "Paul Byrd");
//		reqBody.put("employee_salary", "725000");
//		reqBody.put("employee_age", "64");
//		reqBody.put("profile_image", "");
		
		Response response = given().
				               spec(spec03).
				               body(body).
				            when().
				               post();
		response.prettyPrint();
		
		response.
		     then().
		     assertThat().
		     statusCode(405);
		
	}
}
