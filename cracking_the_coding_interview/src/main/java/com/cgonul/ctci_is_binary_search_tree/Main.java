package com.cgonul.ctci_is_binary_search_tree;

public class Main {

	public static void main(String[] args) {
		//		Node node001 = new Node(1, null, null);
		//		Node node003 = new Node(3, null, null);
		//		Node node002 = new Node(2, node001, node003);
		//
		//		Node node005 = new Node(5, null, null);
		//		Node node007 = new Node(7, null, null);
		//		Node node006 = new Node(6, node005, node007);
		//
		//		Node node004 = new Node(4, node002, node006);

		Node node001 = new Node(1, null, null);
		Node node005 = new Node(5, null, null);
		Node node002 = new Node(2, node001, node005);

		Node node003 = new Node(3, null, null);
		Node node007 = new Node(7, null, null);
		Node node006 = new Node(6, node003, node007);
		Node node004 = new Node(4, node002, node006);

		System.out.println(node004.checkBST(node004));
	}
}

