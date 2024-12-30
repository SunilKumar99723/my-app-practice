package com.mycompany.designpattern.factorymethodpattern2;

public class EmailNotification implements Notification{

	@Override
	public void notifyUsers() {
		System.out.println("Sending Email Notification");
		}
		
}
