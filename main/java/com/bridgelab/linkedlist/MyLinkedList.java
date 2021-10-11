package com.bridgelab.linkedlist;

public class MyLinkedList {
	
	INode head;
	INode tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (tail == null) {
			this.tail = newNode;
		} 
		if (head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printLinkedList() {
		
	}
	
	
}
