package com.javaBasics;

public class AddingTest {
	public static void main(String[] args) {
		Adding add = (a, b, c) -> (a + b + c);
		System.out.println(add.add(5, 10, 10));
	}

}
