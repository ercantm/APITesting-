import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetRequest14 extends Driver {
	/*
	 * When I send request to https://restful-booker.herokuapp.com/booking/3 Then
	 * Status code is 200 And Content type is "application/json" And Status line is
	 * "HTTP/1.1 200 OK" And First name is Mark And Total price is 198 And Deposit
	 * paid is true And checkin date is 2019-06-27
	 * 
	 * Do the assertion 1)By using Hard Assertion 2)By using Soft Assertion
	 */

	@Test
	public void get01() {
spec04.pathParam("bookingid", 3);
		
		Response response = given().spec(spec04).when().get("/{bookingid}");
		response.prettyPrint();
		
//		response.then().assertThat().statusCode(200).contentType(ContentType.JSON).statusLine("HTTP/1.1 200 OK").body(
//			"firstname", Matchers.equalTo("Mary"),
//			"\"totalprice\"", Matchers.equalTo(157),
//			"depositpaid", Matchers.equalTo(false),
//			 "bookingdates.checkin",Matchers.equalTo("2015-05-13"));
		
		JsonPath json= response.jsonPath();
		System.out.println(json.get("firstname"));
		System.out.println(json.get("totalprice"));
		System.out.println(json.get("depositpaid"));
		System.out.println(json.get("bookingdates.checkin"));
		
		Map<String, Object> map= response.as(HashMap.class);
		System.out.println(map.get("firstname"));
		System.out.println(map.get("totalprice"));
		System.out.println(map.get("depositpaid"));
		System.out.println(map.get("bookingdates.checkin"));
		//List<Map<Object, Object>> actualList = json.getList("firstname");
		
//		System.out.println(map);
	}
}
