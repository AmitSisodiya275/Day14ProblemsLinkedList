package com.bridgelab.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedLIstTest {

	@Test
	public void whenAddedToTheLinkedListShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNOde);
		
		Boolean result = linkedList.head.equals(myFirstNode) && 
						 linkedList.head.getNext().equals(mySecondNode) && 
						 linkedList.tail.equals(myThirdNOde);
		
		Assert.assertTrue(result);
	}
	
}
