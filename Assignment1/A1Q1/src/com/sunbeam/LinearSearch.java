package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int arr[], int n, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i] == key) {
			c++;
			if c==n
			ret i;
				System.out.println("Number of comparisons:" + count);
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int key = sc.nextInt();
		int index=linearSearch(arr, arr.length, key);
	}
}
