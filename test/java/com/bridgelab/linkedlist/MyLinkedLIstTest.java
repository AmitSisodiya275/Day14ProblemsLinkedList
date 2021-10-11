package com.bridgelab.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedLIstTest {

	@Test
	public void whenCalledPopMethodShouldRemoveHead() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(myThirdNOde);
		linkedList.insertInTheMiddle(mySecondNode);
		linkedList.printLinkedList();
		linkedList.pop();
		linkedList.printLinkedList();
		
		Boolean result = linkedList.head.equals(mySecondNode) && 
						 linkedList.head.getNext().equals(linkedList.tail);
		
		Assert.assertTrue(result);
	}
	
}
