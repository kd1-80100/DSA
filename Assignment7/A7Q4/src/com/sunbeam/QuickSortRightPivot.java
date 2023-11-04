package com.sunbeam;

import java.util.Arrays;

public class QuickSortRightPivot {

	public static void quicksort(int arr[], int left, int right) {
		if (left >= right)
			return;
		int i = right;// last index 8
		int j = left;// 0

		while (j < i) {
			for (; j <= right && arr[j] <= arr[right]; j++);
			for (; arr[i] >= arr[right]; i--);
			if (j < i) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		int temp = arr[j];
		arr[j] = arr[right];
		arr[right] = temp;

		quicksort(arr, left, i - 1);
		quicksort(arr, i + 1, right);
	}

}