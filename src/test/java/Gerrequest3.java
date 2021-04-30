import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Gerrequest3 extends Driver {
	SoftAssert as = new SoftAssert();
@Test
public void apiTest() {
	Response response= given().spec(spec03).when().get();
	
	response.then().assertThat().statusCode(200);
	JsonPath js= response.jsonPath();
	
	List<String> idlist= js.getList("data.findAll{Integer.valueOf(it.id)>10}.id");
	System.out.println(idlist);
	List<String> agelist= js.getList("data.findAll{Integer.valueOf(it.employee_age)<30}.employee_age");
	System.out.println(agelist);
	List<Integer> intage= new ArrayList<>();
//	for(String  w: agelist) {
//		//Integer.valueOf(w);
//		intage.add(Integer.valueOf(w));
//	}
//	
//	Collections.sort(intage);
//	as.assertTrue(intage.get(-1)==23);
//	as.assertAll();
	
}
}
