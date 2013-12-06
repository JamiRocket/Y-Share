package net.orbitalchainsaw.andro.yshare;

import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Event {
	protected String title;
	protected String summary;
	protected User owner;
	protected float lat, lng;
	protected Date dateStart, dateEnd, dateSent;
	protected int rating;
	
	public Event(JSONObject eventJSON) throws JSONException{
		title = eventJSON.getString("name");
		summary = eventJSON.getString("summary");
		owner = new User(eventJSON.getJSONObject("owner"));
		lat = eventJSON.getLong("lat");
		lng = eventJSON.getLong("lng");
		rating = eventJSON.getInt("rating");
		
	}
	
	public String getTitle(){
		return title;
	}
	

}
