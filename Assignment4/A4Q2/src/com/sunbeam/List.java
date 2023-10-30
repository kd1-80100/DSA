package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node tail;
	private int count;

	public List() {
		this.count = 0;
		this.tail = null;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return tail == null;
	}

//	addFirst(), addLast(), delFirst(), delLast, display()

//	addFirst():
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;

		}
		count++;
	}

//	addLast():
	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}

//	delFirst():
	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		count--;
	}

//	delLast():
	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			Node trav = tail.next;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		count--;
	}

//	displayList():
	public void displayList() {
		Node trav = tail.next;
		System.out.print("List :");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
	}
}
