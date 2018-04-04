package com.ds;

public class DoublyLinkedList {
     
    private final int capacity;
    private int size;
    private Node head;
    private Node tail;
 
    public DoublyLinkedList(int capacity) {
        this.capacity = capacity;
        size = 0;
    }
 
    public void printList() {
        if(head == null) {
            return;
        }
        Node tmp = head;
        while(tmp != null) {
            System.out.print(tmp);
            tmp = tmp.getNext();
        }
    }
 
    public Node addPageToList(int pageNumber) {
        Node pageNode = new Node(pageNumber);       
        if(head == null) {
            head = pageNode;
            tail = pageNode; 
            size = 1;
            return pageNode;
        } else if(size < capacity) {
        	size++;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;
        return pageNode;
    }
 
    public void movePageToHead(Node pageNode) {
        if(pageNode == null || pageNode == head) {
            return;
        }
 
        if(pageNode == tail) {
            tail = tail.getPrev();
            tail.setNext(null);
        }
         
        Node prev = pageNode.getPrev();
        Node next = pageNode.getNext();
        prev.setNext(next);
 
        if(next != null) {
            next.setPrev(prev);
        }
 
        pageNode.setPrev(null);
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;    
    }
 
    public Node getTail() {
        return tail;
    }
    
    public int getSize() {
        return size;
    }
 
    public void setSize(int currSize) {
        this.size = currSize;
    }
 
    public Node getHead() {
        return head;
    }
 
    public void setHead(Node head) {
        this.head = head;
    }
 
    public int getCapacity() {
        return capacity;
    }   
}