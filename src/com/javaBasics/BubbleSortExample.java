package com.javaBasics;

public class BubbleSortExample {

	public static void main(String[] args) {
		int arr[] = { 2, 400, 1, 3, 600, 35, 2, 45, 320, 5 };
		int temp = 0;
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				if (temp < arr[j] && arr[j] < arr[j - 1]) {
					temp = arr[j];
				}
			}

		}

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(temp);

	}
}