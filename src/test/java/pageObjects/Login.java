package pageObjects;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.Login_Pojo;
import testRequest.RequestSpec;

import utilities.ScenarioContext;


public class Login {
	private static String token;
	 private ScenarioContext scenarioContext;
	 
	 public Login(ScenarioContext scenarioContext) {
	        this.scenarioContext = scenarioContext;
	    }

	public void UserLogin() {
		
		Login_Pojo login_payload= new Login_Pojo();
		
		login_payload.setPassword("Apiphase@2");
		login_payload.setUserLoginEmailId("sdetorganizer@gmail.com");
		
		Response response= RestAssured
				.given().contentType(ContentType.JSON)
				.spec(RequestSpec.UserLogin()).body(login_payload)
				.when().post()
				.then()
				.log().all().extract().response();
		
		token= response.jsonPath().getString("token");
		scenarioContext.setContext("token",token);
		  System.out.println("Token generated :" +token);
		
	}
}
