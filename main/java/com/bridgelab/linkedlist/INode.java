package com.bridgelab.linkedlist;

public interface INode<t> {
	 t getKey();
	 void setKey(t key);
	 
	 INode getNext();
	 void setNext(INode next);
	
}
