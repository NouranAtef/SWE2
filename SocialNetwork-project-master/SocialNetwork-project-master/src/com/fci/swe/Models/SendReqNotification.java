package com.fci.swe.Models;

public class SendReqNotification extends Notification{
	public SendReqNotification(String userEmail,String from){
		super(userEmail,from);
	}
	public void send(){
		NotificationEntity n=new NotificationEntity(userEmail,from,"you've sent a request");
		n.saveNotification();
	}
}


