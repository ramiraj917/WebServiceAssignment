package com.event.model;

import java.util.List;

public class Event {

	private String eventId;
	
	private String name;
	
	private String date;

	private String time;
	
	private String location;
	
	private List<String> eventType;
	

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getEventType() {
		return eventType;
	}

	public void setEventType(List<String> eventType) {
		this.eventType = eventType;
	}


	
}
