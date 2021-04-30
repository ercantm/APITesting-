import org.junit.Test;

import com.google.gson.Gson;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Serelization extends Driver{

@Test
public void get0() {
	
spec01.pathParam("id", 2);
	Response response= given().spec(spec01).when().get("/{id}");
	Map <String,Object> map= response.as(HashMap.class);
	Gson gson= new Gson();
	System.out.println(gson.toJson(map));
	
	//List<Map <String,Object>> list = response.as(null, null)
	//list
}

	
}
