package com.javaBasics;

public class PatternDiamond {
	
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			int n=i;
			int k=5-i;
			while (k>0) {
				System.out.print(" ");
				k--;
			}
			while (n>0) {
				System.out.print(i+" ");
				n--;
			}
			System.out.println();
		}
	}

}
