package com.bridgelab.linkedlist;

public class MyLinkedList {
	
	INode head;
	INode tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (head == null) {
			this.head = newNode;
		} 
		if (tail == null) {
			this.tail = newNode;
		} else {
			INode tempNode = this.tail;
			this.tail = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void insertInTheMiddle(INode newNode) {
		this.head.setNext(newNode);
		newNode.setNext(tail);
	}
	
	public void pop() {
		this.head = this.head.getNext();
	}
	
	public void printLinkedList() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(null)) {
			myNodes.append("->");
			tempNode = tempNode.getNext();
			}
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	
}
