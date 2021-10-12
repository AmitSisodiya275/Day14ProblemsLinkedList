package com.bridgelab.linkedlist;

public class MyLinkedList {

	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void append(INode newNode) {
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

	public void insertInTheMiddle(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode != tail) {
			myNodes.append(tempNode.getKey());
			myNodes.append("-->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void popLastNode() {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			if (tempNode.getNext().equals(tail)) {
				this.tail = tempNode;
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
}
