package com.cgonul.ctci_linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Node node01 = new Node(1);
		Node node02 = new Node(2);
		Node node03 = new Node(3);
		node01.setNext(node02);
		node02.setNext(node03);
		node03.setNext(node02);
		System.out.println("Has cycle : " + hasCycle(node01));

	}

	public static boolean hasCycle(Node head) {
		if(head == null){
			return false;
		}
		Set<Node> nodes = new HashSet<>();
		while(head.next != null){
			if(nodes.contains(head)){
				return true;
			}
			nodes.add(head);
			head = head.next;
		}
		return false;
	}

}
