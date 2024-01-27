package com.javaBasics;

import java.util.Arrays;

public class ParallelSort {
	
	public static void main(String[] args) {
		int []a= {40,10,20,50,30};
		Arrays.parallelSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");	
		}
		
	}

}
