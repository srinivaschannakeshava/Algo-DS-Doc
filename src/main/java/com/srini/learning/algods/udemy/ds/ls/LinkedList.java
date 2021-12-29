package com.srini.learning.algods.udemy.ds.ls;

public class LinkedList<T> {

	public LinkedList(T head) {
		this.head=new Node<T>(head);
		this.tail=this.head;
		length++;
	}
	Node<T> head;
	Node<T> tail;
	int length=0;
	
	public void append(T next) {
		this.tail.next=new Node<T>(next);
		this.tail=this.tail.next;
		length++;
	}
	
	public void prepend(T head) {
		Node<T> newHead=new Node<T>(head);
		newHead.next=this.head;
		this.head=newHead;
		length++;
	}
	
	
	public void printLL() {
		Node<T> temp=this.head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
}


