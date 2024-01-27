package com.javaBasics;

public class Sms implements Notification {
	
	@Override
	public void getType() {
		System.out.println("This is SMS Notification");
	}

}
