package test.bank;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestUIBank {

	public static String id;

	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api";
		RequestSpecification inputRequest = RestAssured.given();
		Response response = inputRequest.contentType("application/json")
				.body("{\r\n" + "    \"username\": \"FebApiuser\",\r\n" + "    \"password\": \"Eagle@123\"\r\n" + "}")
				.post("/users/login");

		// Extract Id for Authentication
		id = response.jsonPath().get("id");
	}

	@Test
	public void createAccount() {
		RequestSpecification inputRequest = RestAssured.given();
		Response response = inputRequest.contentType("application/json").header("authorization", id)
				.body("{\r\n" + "    \"friendlyName\": \"SampleAccount\",\r\n" + "    \"type\": \"savings\",\r\n"
						+ "    \"userId\": \"64290731ba9f8a0047adacfc\",\r\n" + "    \"balance\": 100,\r\n"
						+ "    \"accountNumber\": 64602554\r\n" + "}")
				.post("/accounts");
		response.prettyPrint();
	}
	
	/*
	 * @Test 
	 * public void applyLoan() {
	 * RestAssured.baseURI="https://uibank.uipath.com/assets/images/icons/loan.png";
	 * RequestSpecification inputRequest= RestAssured.given(); Response
	 * response=inputRequest.get(); response.prettyPrint(); }
	 */
	@Test
	public void applyLoan() {
		RequestSpecification inputRequest=RestAssured.given();
		Response response=inputRequest
									.contentType("application/json")
									.body("{\r\n"
												+ "    \"email\": \"kvishalicse@gmail.com\",\r\n"
												+ "    \"amount\": 200,\r\n"
												+ "    \"term\": 10,\r\n"
												+ "    \"income\": 50,\r\n"
												+ "    \"age\": 33\r\n"
												+ "}")
										.post("/quotes/newquote");
		response.prettyPrint();
		
		
	}
}
