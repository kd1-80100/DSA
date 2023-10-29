package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[], int n) {
		int count=0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <n-1 ; j++) {
				count++;
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sort:"+Arrays.toString(arr));
		System.out.println("Number of comparisons:"+count);
	}

	public static void main(String[] args) {
		int arr[] = {70, 50, 30, 20, 40, 10, 60};
		System.out.println("**Bubble Sort**");
		System.out.println("Before sort:"+Arrays.toString(arr));
		bubbleSort(arr, arr.length);
	}
}
