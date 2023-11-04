package com.sunbeam;

public class LinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
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

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}

	public void reverseList() {

		Stack stack = new Stack(10);
		Node trav = head;
		while (trav != null) {

			stack.push(trav.data);
			trav = trav.next;
		}
		System.out.print("Reverse list : ");
		while (stack.isEmpty() == false) {

			System.out.print("  " + stack.peek());
			stack.pop();
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
}