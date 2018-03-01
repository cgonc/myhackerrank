package com.cgonul.ctci_is_binary_search_tree;

public class Node {
	int data;
	Node left;
	Node right;

	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	boolean checkBST(Node root) {
		if(root == null){
			return true;
		}
		if(root.data < 0 || root.data > 10000){
			return false;
		}
		if(!checkIsBiggestInSubtree(root.left,root.data)){
			return false;
		}
		if(!checkIsSmallestInSubtree(root.right, root.data)){
			return false;
		}
		return checkBST(root.left) && checkBST(root.right);
	}

	boolean checkIsBiggestInSubtree(Node subtree, int valueToBeChecked){
		if(subtree == null){
			return true;
		}
		if(valueToBeChecked <= subtree.data){
			return false;
		}
		return checkIsBiggestInSubtree(subtree.left,valueToBeChecked) && checkIsBiggestInSubtree(subtree.right,valueToBeChecked);
	}

	boolean checkIsSmallestInSubtree(Node subtree, int valueToBeChecked){
		if(subtree == null){
			return true;
		}
		if(valueToBeChecked >= subtree.data){
			return false;
		}
		return checkIsSmallestInSubtree(subtree.left,valueToBeChecked) && checkIsSmallestInSubtree(subtree.right,valueToBeChecked);
	}
}
