package com.javaBasics;
public class Excercise5_ReverseDigit {
public static void main(String[] args) {
	int n=456789, r=0,s=0;
	
	while(n>0) {
		r=n%10;
		s=r+s*10;
		n=n/10;
	}
	System.out.println(s);
}
	
}
