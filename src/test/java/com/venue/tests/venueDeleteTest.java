package com.venue.tests;


import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.venue.model.Venue;
import com.venue.base.TestBase;
import com.venue.model.Venue;



public class venueDeleteTest extends TestBase  {
	
	
	/**
	 * Test for Deleting venue information
	 */
	@Test
	public void deleteVenue(){
		
		String venueId="1";
		
		given()
		.when()
		.delete("/"+venueId)
		.then()
		.statusCode(204);
	}

}
