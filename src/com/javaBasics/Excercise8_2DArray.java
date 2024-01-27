package com.javaBasics;

public class Excercise8_2DArray {
	public static void main(String[] args) {

		int[][] t = new int[10][10];
		int c = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = 2; j < t[i].length; j++) {
				c = (i + 1) * j;
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
	/*
	 * System.out.println(
	 * "----------------------------------------------------------------"); int[][]
	 * t = new int[10][9]; int i = 0; while (i < t.length) { int j = 0; while (j <
	 * t[i].length) {
	 * 
	 * System.out.print((i + 1) * (j + 2) + "\t");
	 * 
	 * j++; } System.out.println(); i++;
	 * 
	 * } }
	 */

}
