package com.srini.learning.algods.udemy.ds.ls;

public class DoublyLinkedList<T> {
	DNode<T> head;
	DNode<T> tail;
	int length=0;
	
	public DoublyLinkedList(T value) {
		this.head=new DNode<T>(value);
		this.tail=this.head;
		this.length++;
		
	}
	
	public void append(T next) {
		this.tail.next=new DNode<T>(next);
		this.tail.next.prev=this.tail;
		this.tail=this.tail.next;
		length++;
	}
	
	public void prepend(T head) {
		DNode<T> newHead=new DNode<T>(head);
		this.head.prev=newHead;
		newHead.next=this.head;
		this.head=newHead;
		length++;
	}
	
	public void printLL() {
		DNode<T> temp=this.head;
		while(temp!=null) {
			T prev=null;
			T nex=null;
			if(temp.prev!=null)
				prev=temp.prev.value;
			if(temp.next!=null)
				nex=temp.next.value;
			System.out.println(prev+"<--"+temp.value +"-->"+nex);
			temp=temp.next;
		}
	}

}
