package com.bridgelab.linkedlist;

public class MyNode<t> {

	private t key;
	private MyNode next;

	public MyNode(t key) {
		this.key = key;
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

}
