import static org.junit.Assert.*;


import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GerRequest {
	
@Test()
public void get01() {
	// given icin bunu yaz yukari kendi gelmiyor import static io.restassured.RestAssured.*;
	
	
	
	String url="https://restful-booker.herokuapp.com/booking/3";
Response response=	given().accept("application/json").
                   when().
                    get(url);
response.prettyPrint();
response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK").body("firstname", equalTo("Eric")).body("bookingdates.checkin", equalTo("2020-02-05"));
System.out.println(response.getHeaders());
assertEquals(200, response.statusCode());


boolean f =response.getHeader("Server").equalsIgnoreCase("Cowboy");
System.out.println(response.getContentType()+" content type");
System.out.println("ercan read /t"+response.body().toString());
System.out.println(f);

String url2="https://restful-booker.herokuapp.com/booking/15";
Response response2=given().when().get(url2);
response2.
          then().
          assertThat().
          statusCode(404);
System.out.println(response2.body().asString());
assertTrue(response2.body().asString().contains("Not Found"));

}
@Test()
public void get02() {
	// given icin bunu yaz yukari kendi gelmiyor import static io.restassured.RestAssured.*;
	
	
	
	String url="https://restful-booker.herokuapp.com/booking/3";
Response response=	given().accept("application/json").
                   when().
                    get(url);
response.prettyPrint();
response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK").body("firstname", equalTo("Eric"),"bookingdates.checkin", equalTo("2020-02-05"));
System.out.println(response.getHeaders());
assertEquals(200, response.statusCode());


boolean f =response.getHeader("Server").equalsIgnoreCase("Cowboy");
System.out.println(response.getContentType()+" content type");
System.out.println("ercan read /t"+response.body().toString());
System.out.println(f);

String url2="https://restful-booker.herokuapp.com/booking/15";
Response response2=given().when().get(url2);
response2.
          then().
          assertThat().
          statusCode(404);
System.out.println(response2.body().asString());
assertTrue(response2.body().asString().contains("Not Found"));

}

}
