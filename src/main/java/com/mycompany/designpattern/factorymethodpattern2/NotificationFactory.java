package com.mycompany.designpattern.factorymethodpattern2;

public class NotificationFactory {
	public Notification createNotification(String channel) {
		
		if(channel==null || channel.isEmpty())
		return null;
		switch(channel) {
		
		case "SMS" :
			 return new SMSNotification();
			 
		case "EMAIL" :
			return new EmailNotification();
			
		case "WHATSAPP" :
			return new WhatsAppNotification();
			
	    default: throw new IllegalArgumentException("Unknown Channel "+channel);

		}
	
		
		
	}
}
