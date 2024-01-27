package com.String;


public class ReverseSentence {

	public static void main(String[] args) {
		String s = "Vipin Kumar Gupta";
		String[] a = s.split(" ");
		String rev = "";
		for (String b : a) {

			char[] ch = b.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				rev = rev + ch[i];

			}
		}
		System.out.println(rev);
		System.out.println(2+3);
	}
}