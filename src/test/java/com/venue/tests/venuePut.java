package com.venue.tests;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.venue.model.Venue;
import com.venue.base.TestBase;
import com.venue.model.Venue;


public class venuePut extends TestBase{
	
	
	@Test
	public void updateEvent(){
	
		String venueId = "62";
		Venue ven = new Venue();
		ven.setLocation("3879 alhambra street, Canoga Park, 91303");
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(ven)
		.put("/"+venueId)
		.then()
		.statusCode(200);
		
		
	
	}

}
