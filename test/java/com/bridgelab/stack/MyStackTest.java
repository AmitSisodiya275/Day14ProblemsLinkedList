package com.bridgelab.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.linkedlist.INode;
import com.bridgelab.linkedlist.MyNode;

public class MyStackTest {

	@Test
	public void whenAdded3NodesShouldPassStackTest() {
		MyStack myStack = new MyStack();
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.printStack();
		
		INode peak = myStack.peak();
		
		assertEquals(myThirdNode, peak);
	}
	
	@Test
	public void added3NodeWhenPopShouldRemoveHead() {
		MyStack myStack = new MyStack();
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		INode pop = myStack.pop();
		
		myStack.printStack();
		
		assertEquals(myThirdNode, pop);
	}
	
}
