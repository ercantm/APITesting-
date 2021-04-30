package Post;

import org.json.JSONObject;
import org.junit.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Post{
	@Test
	public void post() {
		RequestSpecification spec02 = new RequestSpecBuilder()
				.setBaseUri("https://restful-booker.herokuapp.com/booking").build();

		String requestBody = "{\r\n"
				+ "    \"firstname\": \"emre\",\r\n"
				+ "    \"lastname\": \"ckirac\",\r\n"
				+ "    \"totalprice\": 121,\r\n"
				+ "    \"depositpaid\": true,\r\n"
				+ "    \"bookingdates\": {\r\n"
				+ "        \"checkin\": \"2013-02-23\",\r\n"
				+ "        \"checkout\": \"2014-10-23\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\": \"Breakfast\"\r\n"
				+ "}";
		Response response = given().spec(spec02).auth().basic("admin", "password123").body(requestBody).post();
		response.prettyPrint();
	}
	/// Second way Json 
	@Test
	public void post02() {
	JSONObject reqBody = new JSONObject();
	reqBody.put("firstname", "Ercan");
	reqBody.put("lastname", "Caglayan");
	reqBody.put("totalprice", 252);
	reqBody.put("depositpaid", true);
	
	
	
	JSONObject bookingDatesReqBody = new JSONObject();
	bookingDatesReqBody.put("checkin", "2020-05-02");
	bookingDatesReqBody.put("checkout", "2020-05-05");
	reqBody.put("bookingdates",bookingDatesReqBody);
	reqBody.put("additionalneeds","Lunch");
	
	RequestSpecification spec03 = new RequestSpecBuilder()
			.setBaseUri("https://restful-booker.herokuapp.com/booking").build();
	Response response2=given().spec(spec03).auth().basic("admin", "password123").body(reqBody.toString()).post();

	
	
	}
	
}
