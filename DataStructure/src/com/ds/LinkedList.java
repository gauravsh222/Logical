package com.ds;

public class LinkedList {

	private class Node {
		Node next;
		Object data;
		
		public Node(Object data) {
			this.data=data;
		}
	}
	
	
	private Node head;
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public void addFront(Object data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addBack(Object data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			newNode.next=curr.next;
			curr.next=newNode;
		}
	}
	
	public void clear() {
		head=null;
	}
	
	public Object removeFirst() {
		Node curr=head;
		head = head.next;
		return curr;
	}

	public Object removeLast() {
		Node curr=head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return curr;
	}

	
	public Object removeElement(Object data) {
		Node curr = head;
		Node prev = head;
		if(head.data.equals(data)) {
			head = head.next;
			return curr;
		} else {
			curr = curr.next;
			while (! curr.data.equals(data)) {
				curr = curr.next;
				prev = prev.next;
			}
			prev.next = curr.next;
			return curr;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node curr = head;
		while (curr.next != null) {
			sb.append(curr.data).append("-->");
			curr=curr.next;
		}
		sb.append(curr.data);
		return sb.toString();
	}

}

