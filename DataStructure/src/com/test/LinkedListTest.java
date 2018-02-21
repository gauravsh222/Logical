package com.test;

import com.ds.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int i = 10;
		while (i!=60) {
			ll.addBack(i);
			i+=10;
		}
		System.out.println(ll);
//		ll.removeElement(10);
		ll.removeLast();
		System.out.println(ll);
		
	}

}
