package com.bridgelab.queue;

import com.bridgelab.linkedlist.INode;
import com.bridgelab.linkedlist.MyLinkedList;

public class MyQueue {
	MyLinkedList myLinkedList;
	
	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}
	
	public void enqueu(INode myNode) {
		myLinkedList.append(myNode);
	}
	
	public void printQueue() {
		myLinkedList.printNodes();
	}
	
	public INode dequeue() {
		return myLinkedList.pop();
	}
}
