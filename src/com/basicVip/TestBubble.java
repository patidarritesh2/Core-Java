package com.basicVip;

public class TestBubble {

	public static void main(String[] args) {
		
		int [] arr = {80,20,40,100,60};
		int n = arr.length;
		int temp = 0;
		
		for (int i = 0; i <n; i++) {
			for (int j = 1; j <n-i; j++) {
				
				if (arr[j-1]<arr [j]) {
					temp = arr[j-1];
					arr[j-1] = arr [j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i <n-1; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
}
