package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sort:"+Arrays.toString(arr));
		System.out.println("Number of comparisons:"+count);
	}

	public static void main(String[] args) {
		int arr[] = { 70, 50, 30, 20, 40, 10, 60 };
		System.out.println("**Selection Sort**");
		System.out.println("Before sort:"+Arrays.toString(arr));
		selectionSort(arr, arr.length);
	}
}
