package com.sunbeam;

public class Test {
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);

		list.display();

		list.reverseLinkedList();
		list.display();

	}
}