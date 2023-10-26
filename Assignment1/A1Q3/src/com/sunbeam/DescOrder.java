package com.sunbeam;

import java.util.Scanner;

public class DescOrder {
	public static int descendingArr(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				System.out.println("Element found at index " + mid);
				return mid;
			} else if (key < arr[mid]) {
				left = mid - 1;
			} else {
				right = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int index = descendingArr(arr, arr.length, n);
	}
}
