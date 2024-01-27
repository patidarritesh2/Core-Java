package com.javaBasics;

@FunctionalInterface
 public interface DefaultInt  {
	public void add();

	public default void defaultMeth() {
		System.out.println("default run successfully");
	}

	public static void staticMeth() {
		System.out.println("hello static");
	}
}
