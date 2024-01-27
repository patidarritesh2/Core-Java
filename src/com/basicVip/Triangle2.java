package com.basicVip;

public class Triangle2 {

	
	public static void main(String[] args) {
		
		int n = 5;
		for (int i = 1; i <=n; i++) {
			for (int j = i; j<=n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=i; k++) {
				System.out.print(i);// if put j + " " then it will print pyramid
			}
		System.out.println();
		}
	}
}
