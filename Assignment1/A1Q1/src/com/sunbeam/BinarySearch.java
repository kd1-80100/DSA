package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearchh(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				System.out.println("element found at index " + mid);
				return mid;
			} else if (arr[mid] > key)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int key = sc.nextInt();
		int a = binarySearchh(arr, arr.length, key);
		if (a == -1) {
			System.out.println("element not found");
		}
	}
}
