package com.basicVip;

public class PyramidPattern {

	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			
			for (int j = 4; j >=i; j--) {
				
				System.out.print(" ");
			}for (int k = 1; k <(i*2); k++) { //k <=i;
				System.out.print(i);
			}
//				for (int l = 2; l <=i; l++) {
//				System.out.print(i);
//			}
			System.out.println();
		}
	}
}
