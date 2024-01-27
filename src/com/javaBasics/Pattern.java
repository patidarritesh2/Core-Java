package com.javaBasics;

public class Pattern {

	/**
	 * 5 44 333 22 1
	 */

	public static void main(String[] args) {
		int n = 9;

		for (int i = 9; i > 0; i--) {

			if (i % 2 == 0) {
				System.out.println(" " + i + " " + i);
			}
			if (i % 3 == 0) {
				System.out.println(i + " " + i + " " + i);
			} else if (i % 2 != 0 || i % 3 != 0) {
				System.out.println(" " + " " + i);
			}

		}

	}

}
