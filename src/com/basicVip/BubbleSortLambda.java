package com.basicVip;

interface BubbleSort{
	
	public void checkBubble(int a[]); 
}

public class BubbleSortLambda {

	public static void main(String[] args) {
		
		BubbleSort b = (a)->{
		int n = a.length;
		int temp= 0;
		
		for (int i = 0; i <n; i++) {
			
			for (int j = 1; j <n-i; j++) {
				if (a[j-1]> a[j]) {
					temp = a[j-1];
					a[j-1] =a [j];
					a[j] = temp;
				}
			}
			
		}
			for (int i = 0; i <n-1 ; i++) {
				System.out.print(a[i] + " ");
			}
		};int [] arr = {40,80,100,20,30,200,50};
			b.checkBubble(arr);
	}
}
