package com.venue.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.venue.model.Venue;
import com.venue.base.TestBase;
import com.venue.model.Venue;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

public class VenueGetTest extends TestBase{

	
	
	@Test
	public void getAllVenueInformation() {
			
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
	public void getVenueInfo(){
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
	public void getVenuesForADate(){
			
	Response response= given()
		.param("date", "date=12/05/2018")
		.when()
		.get("/list");
		
   System.out.println(response.prettyPeek());}
	
	

}
