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
		MyNode<Integer> myThirdNOde = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNOde);
		
		myStack.printStack();
		
		INode peak = myStack.peak();
		
		assertEquals(myThirdNOde, peak);
	}
	
}
