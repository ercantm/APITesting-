import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Deserelization extends Driver{

@Test
public void get0() {
	
//spec03.pathParam("id", 2);
//	Response response= given().spec(spec03).when().get();
	//Map <String,Object> map= response.as(HashMap.class);
	//System.out.println(map);
	//System.out.println(map.keySet());
	//System.out.println(map.values());
	//System.out.println(map.containsValue(false));
//	response.print();
//	JsonPath json= response.jsonPath();
//	List<Map> list = json.getList("data");
//	System.out.println(list);
	
	
}
@Test
public void get1() {
	JsonPath json= new JsonPath(new File("C:\\Users\\ercan\\OneDrive\\Desktop\\emp.json"));
	SoftAssert softAssert = new SoftAssert();
	System.out.println(json.toString());
	//Assert that maximum salary is 725,000
	List<String> salaryList = json.getList("data.employee_salary");
	System.out.println(salaryList);
	
//	List<Integer> salaryListInt = new ArrayList<>();
//	for(String w : salaryList) {
//	salaryListInt.add(Integer.valueOf(w));
//	}
//	System.out.println(salaryListInt);
//	
//	Collections.sort(salaryListInt);
//	System.out.println(salaryListInt);
	
//	softAssert.assertTrue(salaryListInt.get(salaryListInt.size()-1)==725000);
	
	System.out.println("===================================");
	
	//Assert that minimum age is 19
	List<String> ageList = json.getList("data.employee_age");
	System.out.println(ageList);
	
	List<Integer> ageListInt = new ArrayList<>();
//	
//	for(String w : ageList) {
//		ageListInt.add(Integer.valueOf(w));
//	}
//	System.out.println(ageListInt);
//	
//	Collections.sort(ageListInt);
//	System.out.println(ageListInt);
//	
//softAssert.assertTrue(ageListInt.get(0)==19);

	softAssert.assertAll();
}

	
}
