package com.javaBasics;

public class Message implements Notification{
	
	@Override
	public void getType() {
		System.out.println("This is Message Notification");
	}
}
