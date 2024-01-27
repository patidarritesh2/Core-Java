package com.String;

public class Stringtest {

	public static void main(String[] args) {

		String s = "vipin";

		char[] ch = s.toCharArray();

		for (char c : ch) {
			if (c != 'i') {
				System.out.print(c);
			}

		}
	}
}
