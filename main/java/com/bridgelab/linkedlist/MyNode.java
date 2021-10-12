package com.bridgelab.linkedlist;

public class MyNode<t> implements INode<t> {

	private t key;
	private INode next;
	
	public MyNode() {
		
	}
	public MyNode(t key) {
		this.key = key;
		this.next = null;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (INode<t>)next;
	}

	@Override
	public t getKey() {
		return key;
	}

	@Override
	public void setKey(t key) {
		this.key = key;
	}

	
}
