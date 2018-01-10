package com.venue.tests;


import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.venue.model.Venue;
import com.venue.base.TestBase;
import com.venue.model.Venue;


public class VenuePostTest extends TestBase {

/**
 * Test for creating new venue	
 */
	@Test
	public void createNewVenue(){
				
		Venue ven = new Venue();
		ven.setLocation("3897 alhambra street, Canoga Park, 91303");
		ven.setVenueId("62");
					
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(ven)
		.post()
		.then()
		.statusCode(201);
		
	
	}
}
