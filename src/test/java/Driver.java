import io.restassured.specification.RequestSpecification;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Driver {
 protected static RequestSpecification spec01;
 protected static RequestSpecification spec02;
 protected static RequestSpecification spec03;
 protected static RequestSpecification spec04;
@Before
public void   setUp01() {
	this.spec01= new RequestSpecBuilder().
            setBaseUri("https://jsonplaceholder.typicode.com/todos").
            build();
	this.spec02= new RequestSpecBuilder().
            setBaseUri("https://restful-booker.herokuapp.com/booking").
            build();
	
spec03= new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com/api/v1/employees").build();

spec04= new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com/booking").build();


}
}
