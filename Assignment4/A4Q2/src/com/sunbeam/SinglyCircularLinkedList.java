package com.sunbeam;

public class SinglyCircularLinkedList {
	public static void main(String[] args) {
		List l=new List();
		l.addFirst(16);
		l.addFirst(12);
		l.addFirst(19);
		l.addFirst(95);
		l.displayList();
		System.out.println();
		
		l.addLast(16);
		l.addLast(12);
		l.addLast(7);
		l.displayList();
		System.out.println();
		
		l.delFirst();
		l.delFirst();
		l.displayList();
		System.out.println();
		
		l.delLast();
		l.delLast();
		l.delLast();
		l.displayList();
		System.out.println();
	}
}
