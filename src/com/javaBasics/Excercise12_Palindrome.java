package com.javaBasics;

public class Excercise12_Palindrome {
public static void main(String[] args) {
	
		int rev=0,rem=0,num=121 ,org=num;
		
		while(num!=0) {
			
			rem = num%10;
			System.out.print(rem+" ");
			rev = rem+rev*10;
			System.out.print(rev+" ");
			num = num/10;
			System.out.println(num+" ");
			System.out.println();
		}
		if(org==rev) {
			System.out.println("Number is Pallindrome");
		}else {
			System.out.println("Number is not Pallindrome");

		}
}
}
