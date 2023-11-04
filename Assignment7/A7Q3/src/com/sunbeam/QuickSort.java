package com.sunbeam;

import java.util.Arrays;

public class QuickSort {

	public static void quicksort(int arr[], int left, int right) {
		if (left >= right)
			return;
		int i = left;
		int j = right;
		while (i < j) {
			for (; i <= right && arr[i] >= arr[left]; i++)
				;
			for (; arr[j] < arr[left]; j--)
				;
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[left];
		arr[left] = temp;

		quicksort(arr, left, j - 1);
		quicksort(arr, j + 1, right);
	}

}