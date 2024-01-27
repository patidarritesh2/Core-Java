package com.javaBasics;

public class Excercise4_Factorial {
	public static void main(String[] args) {

		int num = 6;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println("factorial=" + fact);

	}

}
