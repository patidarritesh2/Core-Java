package com.String;

public class Palindorm {

	public static void main(String[] args) {
		StringBuffer S = new StringBuffer("mem");
		StringBuffer r1 = S.reverse();
//String s =S.toString();
		if (S.equals(r1)) {
			System.out.println("string is palindrome");

		} else {
			System.out.println("string is not palindrome");
		}
	}
}
