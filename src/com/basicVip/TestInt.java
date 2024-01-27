package com.basicVip;

public interface TestInt {
	
	public void add ();

	public static void statMet() {
		System.out.println("static");
	}
	public default void defMet() {
		System.out.println("def");
	}
}
