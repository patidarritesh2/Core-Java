package com.javaBasics;

public class AverageSumOddEven {

	public static void main(String[] args) {

		int n = 10;
		int esum = 0, osum = 0, e = 0, os = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				esum = esum + i;
				e++;
			} else {
				osum = osum + i;
				os++;
			}
		}
		System.out.println("the odd sum is --- " + osum);
		System.out.println("the even sum is---- " + esum);
		System.out.println("aveage even sum is-- " + esum / e);
		System.out.println("the average odd sum is--- " + osum / os);

	}

}
