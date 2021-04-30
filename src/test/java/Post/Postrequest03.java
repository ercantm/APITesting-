package Post;

import org.json.JSONObject;
import org.junit.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Postrequest03 extends TestBase {
	
	@Test
	public void post01() {
		
		/*
		 {
		    "userId": 1,
		    "title": "XXXXXXXXXX",
		    "completed": true
          }
		*/
		
		JSONObject reqBody = new JSONObject();
		reqBody.put("userId", 1);
		reqBody.put("title", "XXXXXXXXXX");
		reqBody.put("completed", true);
		
		Response response = given().
				               spec(spec01).
				               body(reqBody).
				            when().
				               post();
		response.prettyPrint();
		
		response.
		     then().
		     assertThat().
		     statusCode(201);
	}

}