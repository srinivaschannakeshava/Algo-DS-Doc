package com.srini.learning.algods.udemy.ds.ls;

//reverse a given singly linked list
public class Q1 {

	//
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>(10);
		ll.append(9);
		ll.append(8);
		ll.append(7);
		ll.append(6);
		ll.append(5);
		ll.printLL();
System.out.println("---------------------");
		reverseLL(ll);
		reverseLL(new LinkedList<Integer>(10));
	}

	private static void reverseLL(LinkedList<Integer> ll) {
		Node<Integer> temp = ll.head;
		Node<Integer> tempNext = temp.next;
		
		while (tempNext != null) {
			Node<Integer> next = tempNext.next;
			tempNext.next=temp;
			temp = tempNext;
			tempNext=next;
		}
		Node<Integer> head = ll.head;
		ll.head = ll.tail;
		ll.tail=head;
		ll.tail.next = null;
		ll.printLL();
	}

}
