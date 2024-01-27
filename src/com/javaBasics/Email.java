package com.javaBasics;

public class Email implements Notification{

	@Override
	public void getType() {
		System.out.println("This is Email Notification");
	}
}
