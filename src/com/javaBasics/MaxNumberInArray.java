package com.javaBasics;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int[] num = { 240, 80, 290, 190, 180, 40 };
		int a=0;
		int b =0;
		for (int i = 0; i < num.length; i++) {
			if (a<num[i]) {
				b=a;
				a=num[i];
			}
		}
		System.out.println("First Highest Number is---- "+a);
		System.out.println("Second Highest Number is---- "+b);
	}
}
