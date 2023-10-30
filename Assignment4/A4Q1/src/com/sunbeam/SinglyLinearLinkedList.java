package com.sunbeam;

public class SinglyLinearLinkedList {
	public static void main(String[] args) {
		List l=new List();
		l.addFirst(2);
		l.addFirst(1);
		l.addFirst(6);
		l.addFirst(1);
		l.addFirst(7);
		
		l.addLast(123);
		l.addLast(100);
		
		l.delFirst();
		
		l.delLast();
		
		l.displayList();
	}
}
