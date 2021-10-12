package com.bridgelab.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.linkedlist.INode;
import com.bridgelab.linkedlist.MyNode;

public class MyQueueTest {
	
	@Test
	public void when3NodedEnquedShouldPassQueueTest() {
		MyQueue myQueue = new MyQueue();
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		
		INode dequeue = myQueue.dequeue();
		
		assertEquals(myFirstNode, dequeue);
		
	}
}
