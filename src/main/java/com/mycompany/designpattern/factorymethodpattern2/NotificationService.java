package com.mycompany.designpattern.factorymethodpattern2;

public class NotificationService {
	public static void main(String[] argrs) {
	NotificationFactory notificationFactory = new NotificationFactory();
	Notification notification = notificationFactory.createNotification("SMS".toUpperCase());
	notification.notifyUsers();

	}
}
