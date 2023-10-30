package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		MiddleNode l=new MiddleNode();

		l.addFirst(50);
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);

		int data = l.middleElementMethod();
		System.out.println("Middle element : " + data);
	}

}