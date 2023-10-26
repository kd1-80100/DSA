package com.sunbeam;

import java.util.Scanner;

public class NthOccurance {
	public static int nthOcc(int[]arr,int key) {
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (key== arr[i]) {
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println("Enter the key:");
		int key=sc.nextInt();
		int index=nthOcc(arr, key);
		if (index==0) {
			System.out.println("key is not present in array.");
		}
		else {
			System.out.println("last occurance of key "+key+" is at index:"+index);
		}
	}
}
