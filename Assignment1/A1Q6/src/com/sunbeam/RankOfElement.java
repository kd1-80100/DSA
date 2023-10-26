package com.sunbeam;

import java.util.Scanner;

public class RankOfElement {
	public static int rankofNumber(int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key >= arr[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the key from array:");
		int key = sc.nextInt();
		int index = rankofNumber(arr, arr.length, key);
		System.out.println(index);
		sc.close();
	}
}
