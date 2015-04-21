package com.fci.swe.Models;

public class AcceptReqNotification extends Notification{
	public AcceptReqNotification(String userEmail,String from){
		super(userEmail,from);
	}
	public void send(){
		NotificationEntity n=new NotificationEntity(userEmail,from,"AcceptRequest");
		n.saveNotification();
	}
}
