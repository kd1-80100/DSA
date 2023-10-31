package com.sunbeam;

public class ReverseLinkedList {

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;

	public ReverseLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newnode = new Node(data);
		if (isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List");
		while (trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void reverseLinkedList() {
		if (isEmpty()) {
			System.out.println("List is empty.");
		}
		Node t1=head;
		Node t2 = head.next;

		head.next = null;
		while (head != null) {
			head = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = head;
		}
		head=t1;
	}

}
