package com.event.tests;


import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.event.base.TestBase;
public class EventDeleteTest extends TestBase  {
	
	
	/**
	 * Test for Deleting event information
	 */
	@Test
	public void deleteEvent(){
		
		String eventId="59";
		
		given()
		.when()
		.delete("/"+eventId)
		.then()
		.statusCode(204);
	}

}
