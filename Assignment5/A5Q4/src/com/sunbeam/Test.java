package com.sunbeam;

public class Test {
	public static void main(String[] args) {
		BSTree bst = new BSTree();

		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(13);

		bst.preOrder();

	}
}