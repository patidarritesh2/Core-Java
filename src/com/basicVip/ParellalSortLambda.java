package com.basicVip;

import java.util.Arrays;

interface ParellalSortInt{
	
	public void checkParellal(int a []);
}
public class ParellalSortLambda {
public static void main(String[] args) {
	

	ParellalSortInt s = (a)->{
		
	Arrays.parallelSort(a);
	for (int c : a) {
		System.out.print(c);
	}
		
	};int [] arr = {10,30,20,40};
	s.checkParellal(arr);
}	
}
