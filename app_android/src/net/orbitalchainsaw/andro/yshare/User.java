package net.orbitalchainsaw.andro.yshare;

import org.json.JSONException;
import org.json.JSONObject;

public class User {
	protected static int uid;
	
	
	public User(JSONObject userJSON) throws JSONException{
		uid = userJSON.getInt("uid");
	}

}
