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

		System.out.println(checkBST(node004));
	}

	private static boolean constraints(int data) {
		return data < 0 || data > 10000;
	}

	private static boolean checkBSTHelper(Node root, int rootData) {
		if(root == null){
			return true;
		}

		if(constraints(root.data)){
			return false;
		}

		if(root.left != null && root.data < root.left.data){
			return false;
		}

		if(root.right != null && root.data > root.right.data){
			return false;
		}

		if(root.left != null && root.left.data > rootData){
			return false;
		}

		if(root.right != null && root.right.data < rootData){
			return false;
		}

		return checkBSTHelper(root.left, rootData) && checkBSTHelper(root.right, rootData);
	}

	private static boolean checkBST(Node root) {
		if(root == null){
			return true;
		}
		return checkBSTHelper(root, root.data);
	}
}

