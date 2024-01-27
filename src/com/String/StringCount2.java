package com.String;

public class StringCount2 {

	public static void main(String[] args) {

		String s = "Aadarsh";
		int count = 0;

		char[] ch = s.toCharArray();

		for (char c : ch) {

			if (c == 'a') {
				count++;
			}

		}
		System.out.println(count);
	}

}
