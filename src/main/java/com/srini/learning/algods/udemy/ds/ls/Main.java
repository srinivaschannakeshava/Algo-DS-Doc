package com.srini.learning.algods.udemy.ds.ls;

public class Main {
	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<Integer>(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.prepend(6);
		ll.prepend(7);
		ll.prepend(8);
		ll.prepend(9);
		ll.printLL();
		System.out.println("lenth of ll : "+ll.length);
		DoublyLinkedList<Integer> dl=new DoublyLinkedList<Integer>(1);
		dl.append(2);
		dl.append(3);
		dl.append(4);
		dl.append(5);
		dl.prepend(6);
		dl.prepend(7);
		dl.prepend(8);
		dl.prepend(9);
		dl.printLL();
		
		
	}
}
