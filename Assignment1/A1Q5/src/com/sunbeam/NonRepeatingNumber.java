package com.sunbeam;

public class NonRepeatingNumber {
	public static int nonRepeatingNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			if (count == 0) 
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int firstNum = nonRepeatingNum(arr);
		if (firstNum != -1) {
			System.out.println("first non repeating element:" + firstNum);
		} else {
			System.out.println("no repeating elements.");
		}
	}
}
