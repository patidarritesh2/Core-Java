package com.javaBasics;

abstract class TestAnnoy<String> {
	abstract String show(String a, String b);
}

public class AnnoyExample {
	public static void main(String[] args) {
		TestAnnoy<String> a = new TestAnnoy<String>() {
			String show(String a, String b) {
				return a + b;
			}
		};
		String result = a.show("Java", "9");
		System.out.println(result);
	}
}
