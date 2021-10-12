package com.bridgelab.stack;

import com.bridgelab.linkedlist.INode;
import com.bridgelab.linkedlist.MyLinkedList;

public class MyStack {
	
	public MyLinkedList myLinkedList;
	
	public MyStack() {
		myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printStack() {
		myLinkedList.printNodes();
	}

	public INode peak() {
		return myLinkedList.head;
	}
}
