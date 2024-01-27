package com.javaBasics;

public class StaticMethod {
	
	static {
		int i=5;
		System.out.println("static Block");
	}
	
	
	public static void hello() {
		System.out.println("hello static method");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello static main method");
	}

}
