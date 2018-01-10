package com.event.tests;


import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.event.base.TestBase;
import com.event.model.Event;


public class EventPostTest extends TestBase {

/**
 * Test for creating new event	
 */
	@Test
	public void createNewEvent(){
		ArrayList<String> eventType = new ArrayList<String>();
		eventType.add("Wedding");
		eventType.add("Reception");
		
	
		Event event = new Event();
		event.setEventId("61");
		event.setName("Stephen George");
		event.setDate("10/23/20187");
		event.setLocation("4879 5th street, North Hollywood, 91316");
		event.setTime("7 PM");
		event.setEventType(eventType);
					
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(event)
		.post()
		.then()
		.statusCode(201);
		
	
	}
}
