package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {
	
	@Test
	public void incident() {
		
		//Enter the Endpoint
		RestAssured.baseURI="https://dev140572.service-now.com/api/now/table/";
		
		// Give Authorization
		
		RestAssured.authentication=RestAssured.basic("admin", "P-qQ7@umSYz8");
		
		// Specify the header for content type and Add the request body --Form the request
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").body("{\r\n"
				+ "    \"description\": \"hi\",\r\n"
				+ "    \"short_description\": \"Test description\"\r\n"
				+ "}");
		
		// Send the Request
		
		Response response = inputRequest.post("incident");
	
		
		// prints the Response in console
		response.prettyPrint();
		
	}

}
