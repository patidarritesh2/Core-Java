package com.javaBasics;

public class NotificationFactory {

	public Notification getMessage(int num) {
		if (num == 1) {
			return new Sms();
		}
		if (num == 2) {
			return new Email();
		}
		if (num == 3) {
			return new Message();
		}
		return null;
		
	}
	public static void main(String[] args) {
		
		NotificationFactory not = new NotificationFactory();
		Notification n = not.getMessage(2);
		n.getType();
	}

}
