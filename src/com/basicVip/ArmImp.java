package com.basicVip;

interface ArmInt {

	public void armTest(int a);
}


public class ArmImp {

	public static void main(String[] args) {
		ArmInt a = (b) -> {

			int r = 0, sum = 0, p = b;
			while (b > 0) {
				r = b % 10;
				b = b / 10;
				sum = sum + (r * r * r);
			}
			if (sum == p) {
				System.out.println(sum + " Armstrong");
			} else {
				System.out.println("not Armstrong");
			}
		};
		a.armTest(153);
	}
}
