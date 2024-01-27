package com.basicVip;

public class PrimeImp {

	public static void main(String[] args) {
		PrimeInt p = (a)->{
			
			int prime = 0;
			
		for (int i = 2; i<a; i++) {
			if (a%i ==0) {
				prime = prime+1;
			}
		}	
		if (prime==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		};
		p.primeTest(11);
	}
}
