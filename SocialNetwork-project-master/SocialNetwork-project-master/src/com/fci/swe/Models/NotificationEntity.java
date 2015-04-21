package com.fci.swe.Models;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class NotificationEntity { 
	// reciever
	protected String userEmail;
	protected String from;
	protected String text;
	public NotificationEntity(String email, String F,String T)
	{
		userEmail=email;
		from=F;
		text=T;	
	}
	public boolean saveNotification(){
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("Notifications");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity Notfication = new Entity("Notifications", list.size() + 1);

		Notfication.setProperty("userEmail", this.userEmail);
		Notfication.setProperty("from", this.from);
		Notfication.setProperty("someText", this.text);
		Notfication.setProperty("notified", "no");
		datastore.put(Notfication);
		return true;
	}
	
	public static String getNotification(String email) {

		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("Notifications");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		String returnString="";
		for (Entity entity : pq.asIterable()) {
			if (entity.getProperty("userEmail").toString().equals(email)&&entity.getProperty("notified").toString().equals("no")){
				if (entity.getProperty("someText").toString().equals("AcceptRequest")){
					entity.setProperty("notified", "yes");
					datastore.put(entity);
					return entity.getProperty("from").toString()+" "+"has accepted your friend request";
				}
				else if(entity.getProperty("someText").toString().equals("NewMessage")){
					//implementation here
					return "";
				}
				
			}
		}

		return "";

	}
	
}
