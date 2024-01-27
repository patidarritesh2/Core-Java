package com.javaBasics;

public class Excercise6_Fibonacies {
	public static void main(String[] args) {
		
		int a=0,b=1,k=0;
		while (k<50) {
			k=a+b;
			a=b;
			b=k;
			System.out.print(k+" ");
		}
		
	}
}
