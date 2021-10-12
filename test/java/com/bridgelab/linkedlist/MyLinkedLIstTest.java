package com.bridgelab.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedLIstTest {
	
	@Test
	public void given3NumberWhenLinkedShoulPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode) && 
							mySecondNode.getNext().equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenAddedToTheLinkedListShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(56);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNOde);
		
		Boolean result = linkedList.head.equals(myThirdNOde) && 
						 linkedList.head.getNext().equals(mySecondNode) && 
						 linkedList.tail.equals(myFirstNode);
		
		Assert.assertTrue(result);
	}
	
	@Test 
	public void whenAppendedToTheLinkedListShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNOde);
		
		Boolean result = linkedList.head.equals(myFirstNode) &&
						 linkedList.head.getNext().equals(mySecondNode) &&
						 linkedList.tail.equals(myThirdNOde);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenInsertedInTheMiddleShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNOde);
		linkedList.insertInTheMiddle(myFirstNode,mySecondNode);
		
		
		Boolean result = linkedList.head.equals(myFirstNode) && 
						 linkedList.head.getNext().equals(mySecondNode) && 
						 linkedList.tail.equals(myThirdNOde);
		
		Assert.assertTrue(result);
	}

	@Test
	public void whenCalledPopMethodShouldRemoveHead() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNOde);
		
		linkedList.printNodes();
		linkedList.pop();
		linkedList.printNodes();
		
		Boolean result = linkedList.head.equals(mySecondNode) && 
						 linkedList.head.getNext().equals(linkedList.tail);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenCalledPopLastNodeMethodShouldRemoveTail() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNOde = new MyNode<>(70);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNOde);
		
		linkedList.printNodes();
		linkedList.popLastNode();
		linkedList.printNodes();
		
		Boolean result = linkedList.head.equals(myThirdNOde) &&
						 linkedList.tail.equals(mySecondNode);
		
		Assert.assertTrue(result);
	}
}
