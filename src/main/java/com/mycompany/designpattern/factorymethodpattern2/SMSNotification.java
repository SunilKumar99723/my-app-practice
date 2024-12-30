package com.mycompany.designpattern.factorymethodpattern2;

public class SMSNotification implements Notification {

	@Override
	public void notifyUsers() {
		System.out.println(" sending SMS Notification ");		
	}
	
}
