package com.test;

import com.ds.LinkedList;
import com.ds.Node;

public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
	/*	ll.addBack(1);
		ll.addBack(1);
		ll.addBack(2);
		ll.addBack(3);*/
		ll.addBack(4);
		ll.addBack(4);
		ll.addBack(4);
		ll.addBack(5);
		ll.addBack(6);
		System.out.println(ll);
		removeDuplicates(ll);
		
	}

	private static void removeDuplicates(LinkedList<Integer> ll) {
		Node<Integer> head = ll.getHead();
		Node<Integer> next;
		Node<Integer> curr = head;
		
		while (curr != null && curr.getNext() != null) {
			if (curr.getNext().getData() == curr.getData()) {
				next = curr.getNext().getNext();
				curr.setNext(next);
			}
			if (curr.getData() != curr.getNext().getData()) {
				curr = curr.getNext();
			}
		}
		System.out.println(ll);
	}
}
