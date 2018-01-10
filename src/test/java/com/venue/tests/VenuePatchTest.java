package com.venue.tests;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.venue.model.Venue;
import com.venue.base.TestBase;
import com.venue.model.Venue;


public class VenuePatchTest  extends TestBase{

	
	/**
	 * Test for Updating update event information
	 */
	
	@Test
	public void updateVenue(){
		
		String venueId="3";
		
		Venue ven = new Venue();
		ven.setDate("12/12/2018");
		ven.setLocation("3897 alhambra street, Canoga Park, 91303");
		ven.setVenueId("53");
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(ven)
		.patch("/"+venueId)
		.then()
		.statusCode(200);
		
	
	}

}
