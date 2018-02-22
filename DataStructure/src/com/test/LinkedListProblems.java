package com.test;

import com.ds.LinkedList;
import com.ds.Node;

public class LinkedListProblems {
	public static void main(String[] args) {
//		reverseLinkedList();
//		System.out.println(findIntersection());
		findLoop();
	}

	private static void findLoop() {
		
	}

	private static Integer findIntersection() {
		LinkedList<Integer> l1 = createList();
		LinkedList<Integer> l2 = createList();
		l1.addFront(50);
		l1.addFront(60);
		/*l1.removeElement(10);
		l1.removeElement(20);
		l1.removeElement(30);
		l1.removeElement(40);*/
		System.out.println(l1);
		l2.addFront(70);
		l2.addFront(80);
		l2.addFront(90);
		System.out.println(l2);
		
		
		int m = l1.length();
		int n = l2.length();
		
		// Difference in no of element....!
		int d = Math.abs(m-n);
		
		Node<Integer> curr1 = l1.getHead();
		Node<Integer> curr2 = l2.getHead();
		
		if(n > m) {
			Node<Integer> temp = curr1;
			curr1=curr2;
			curr2=temp;
		}
		
		for(int i=0; i<d; i++) {
			curr1 = curr1.getNext();
		}
		
		while(curr1.getNext() != null) {
			if(curr1.getData().equals(curr2.getData()))
				 return curr1.getData();
			curr1 = curr1.getNext();
			curr2 = curr2.getNext();
		}
		return null;	
	}

	private static void reverseLinkedList() {
		LinkedList<Integer> ll = createList();
		System.out.println(ll);
		ll.reverse();
		System.out.println(ll);
	}

	private static LinkedList<Integer> createList() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addBack(10);
		ll.addBack(20);
		ll.addBack(30);
		ll.addBack(40);
		return ll;
	}

	
}
