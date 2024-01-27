package com.javaBasics;

import java.util.Iterator;

public class HarmonicSeries {

	public static void main(String[] args) {

		double j = 5;
		double k = 0;

		System.out.print("1");

		for (int i = 2; i <= j; i++) {

			System.out.print("+");

			System.out.print("1/" + i);

		}

		System.out.print(" = ");

		while (j > 0) {

			k = k + 1 / j;
			j--;

		}

		System.out.print(k);

		System.out.println();
		System.out.println("------**************--------");
		int n1 = 5;
		double result = 0.0;
		for (int i = n1; i > 0; i--) {
			result = result + (double) 1 / i;
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println("-----*****************---------");

		int z = 5;
		double y = 0.0;
		System.out.print("1");
		for (int i = 2; i <= z; i++) {
			System.out.print("+");
			System.out.print("1/" + i);
		}
		System.out.print(" = ");

		for (int i = z; i > 0; i--) {

			y = y + (double) 1 / i;
		}
		System.out.print(y);
	}

}
