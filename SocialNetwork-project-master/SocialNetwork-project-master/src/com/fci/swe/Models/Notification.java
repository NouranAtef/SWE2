package com.fci.swe.Models;

public abstract class Notification {
	protected String userEmail;
	protected String from;
	public Notification(String userEmail,String from){
		this.userEmail=userEmail;
		this.from=from;
	}
	public abstract void send();//execute();

}
