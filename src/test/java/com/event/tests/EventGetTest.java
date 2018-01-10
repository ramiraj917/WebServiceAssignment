package com.event.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.event.base.TestBase;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

public class EventGetTest extends TestBase{

	
	
	@Test
	public void getAllEventsInformation() {
			
		Response response=	given()
		.when()
		.get("/list");
		
		System.out.println(response.body().prettyPrint());
		
		//Validate the status code
		
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
	}
	
	@Test
	public void getAnEventInfo(){
		Response response=given()
		.when()
		.get("/1");		
		given()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}
	
	@Test
	public void getEventsFromLocation(){
		Response response=	given()
		.when()
		.get("/list?location=345 ave, Northridge, CA, 91326");
		
		System.out.println(response.prettyPeek());
		
	Response response2= given()
		.param("location", "location=345 ave, Northridge, CA, 91326")
		.when()
		.get("/list");
		
   System.out.println(response2.prettyPeek());}
	
	

}
