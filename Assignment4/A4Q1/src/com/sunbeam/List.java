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

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

//	addFirst(), addLast(), delFirst(), delLast, display()

//	addFirst():
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

//	addLast():
	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
		} else if (head.next == null) {
			head.next = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

//	delFirst():
	public void delFirst() {
		if (isEmpty()) {
			System.out.println("list is empty");
			return;
		} else {
			head=head.next;
		}
	}
	
//	delLast():
	public void delLast() {
		if (isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		else if (head.next==null) {
			head=tail=null;
		}else {
			Node trav=head;
			while (trav.next.next!=null) {
				trav=trav.next;
			}
			trav.next=null;
			tail=trav;
		}
	}

//	displayList():	
	public void displayList() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
}
