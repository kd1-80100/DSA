package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;

public class InsertionSort {
	public static void insertionSort(int arr[],int n) {
		int count=0;
		for (int i = 1; i < n; i++) {
			int temp=arr[i];
			int j=i-1;
			while (j>=0 && arr[j]>temp) {
				count++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("Number of comparisons:"+count);
		System.out.println("After sort:"+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {70, 50, 30, 20, 40, 10, 60};
		System.out.println("**Insertion Sort**");
		System.out.println("Before sort:"+Arrays.toString(arr));
		insertionSort(arr, arr.length);
	}

}
