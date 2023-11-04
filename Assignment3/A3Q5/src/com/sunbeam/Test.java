package com.sunbeam;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		Stack sc= new Stack(10);
		
		int arr[]= {5,3,8,2,9,1};
		for(int i=0;i<arr.length;i++)
		{
			sc.push(arr[i]);
		}
		System.out.println("Original array : " +Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.peek();
			sc.pop();
			
		}
		
		System.out.println("Reverse array : " +Arrays.toString(arr));
		
	}
}