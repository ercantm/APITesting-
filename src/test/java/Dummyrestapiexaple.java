import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import  org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Dummyrestapiexaple extends Driver {
	


	protected RequestSpecification spec01;
	//@Test()
//	public void getres01() {
//	spec02.queryParam("firstname","Susan");
//	//spec02.queryParam("firstname","Susan");
//	//spec01.pathParam("id", "/123");
////		String Url="http://dummy.restapiexample.com/api/v1/employees";
////		Response response= given().accept(ContentType.JSON).when().get(Url);
////		//response.prettyPrint();
////		//response.prettyPeek();
////	//	response.then().assertThat().statusCode(200).contentType(ContentType.JSON).body("data.id",Matchers.hasSize(24), "data.employee_name",Matchers.hasItem("Dai Rios"),"data.mployee_age");
////	  response.then().assertThat().statusCode(200);
////	
////		spec01=new RequestSpecBuilder().
////	            setBaseUri("https://jsonplaceholder.typicode.com/todos").
//	          //  build();
//		//Response res= given().spec(spec01()).when().get("123");
//		Response res= given().spec(Driver.spec01).when().get();
//	//	res.prettyPeek();
//		res.then().assertThat().statusCode(200);
//	Response res2=given().spec(Driver.spec02).when().get("3");
//	res2.prettyPrint();
//	res2.then().assertThat().statusCode(200);
//	//assertTrue(res2.asString().contains("bookingid"));
//	
//	}
//
//	@Test
//	public void getres02() {
//		
//		spec02.pathParam("bookingid", 5);
//		Response reso= given().spec(spec02).when().get("/{bookingid}");
//		reso.prettyPrint();
//		JsonPath json =reso.jsonPath();
//		json.get("firstname").toString().contains("Sally");
//		System.out.println(json.get("bookingdates.checkin"));
//		assertEquals("firt name has to be eric","Susan",json.get("firstname"));
//	}
	@Test
	public void getres03() {
		
		Response response=given().spec(spec03).when().get();
		
		//response.prettyPrint();
		JsonPath json= response.jsonPath();
		json.get("data.employee_name");
		System.out.println(json.get("data[2].employee_name"));
		System.out.println(json.get("data[0,1,2,3,4].employee_name"));
		System.out.println(json.get("data[-1].employee_name"));
		assertEquals(json.getList("data.employee_name").size(),24);
		response.then().assertThat().body("data.employee_name", Matchers.hasSize(24));
	}
}
