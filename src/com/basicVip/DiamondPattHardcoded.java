package com.basicVip;

public class DiamondPattHardcoded {

	public static void main(String[] args) {

		int j = 5;

		for (int i = 5; i >= 1; i--) {

			if (i != 3 && i % 2 != 0) {
				System.out.print(" " + " " + i);
				System.out.println();
			}
			if (i % 2 == 0) {
				System.out.print(" " + i + " " + i);
				System.out.println();
			}
			if (i == 3) {
				System.out.println(i + " " + i + " " + i);
			}
		}
	}
}
