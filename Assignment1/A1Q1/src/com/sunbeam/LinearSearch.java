package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int arr[], int key) {
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return count;
			} else {
				count++;
			}
		}

		if (count > arr.length) {
			return -1;
		} else
			return count;
	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int key = sc.nextInt();
		int index=linearSearch(arr, key);
		if (index == -1) {
			System.out.println("element not found");
		}else {
			System.out.println("element found at index "+index);
		}
	}
}
