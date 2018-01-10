package com.event.tests;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.event.base.TestBase;
import com.event.model.Event;


public class EventPatchTest  extends TestBase{

	
	/**
	 * Test for Updating update event information
	 */
	
	@Test
	public void updateEvent(){
		
		String eventId="50";
		
		ArrayList<String> eventType = new ArrayList<String>();
		eventType.add("Birthday");
		
		Event event = new Event();
		event.setDate("01/01/2018");
		event.setName("John Abraham");
		event.setLocation("123 ave, Van Nuys, CA, 91326");
		event.setTime("8 PM");		
		event.setEventType(eventType);		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(event)
		.patch("/"+eventId)
		.then()
		.statusCode(200);
		
	
	}

}
