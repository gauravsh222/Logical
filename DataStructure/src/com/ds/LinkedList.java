package com.ds;

public class LinkedList<T> {

	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void addFront(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void addBack(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node<T> curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			newNode.setNext(curr.getNext());
			curr.setNext(newNode);
		}
	}

	public void clear() {
		head = null;
	}

	public T removeFirst() {
		Node<T> curr = head;
		head = head.getNext();
		return curr.getData();
	}

	public T removeLast() {
		Node<T> curr = head;
		while (curr.getNext().getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(curr.getNext().getNext());
		return curr.getData();
	}

	public Object removeElement(Object data) {
		Node<T> curr = head;
		Node<T> prev = head;
		if (head.getData().equals(data)) {
			head = head.getNext();
			return curr;
		} else {
			curr = curr.getNext();
			while (!curr.getData().equals(data)) {
				curr = curr.getNext();
				prev = prev.getNext();
			}
			prev.setNext(curr.getNext());
			return curr;
		}
	}

	public void reverse() {
		Node<T> curr = head;
		Node<T> next = null;
		Node<T> prev = null;
		
		while (curr != null) {
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		head=prev;
	}

	public int length() {
		Node<T> curr = head;
		int len=0;
		while (curr != null) {
			curr = curr.getNext();
			len++;
		}
		return len;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> curr = head;
		while (curr != null) {
			sb.append(curr.getData()).append("-->");
			curr = curr.getNext();
		}
		sb.append("null");
		return sb.toString();
	}

}
