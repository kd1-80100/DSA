package com.sunbeam;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int arr[]= {66,33,99,11,77,22,55,66,88};
		System.out.println("Before sort : " + Arrays.toString(arr));
		QuickSortRightPivot.quicksort(arr, 0, arr.length-1);
		System.out.println("After sort : " + Arrays.toString(arr));
	}
}
