package com.srini.learning.algods.udemy.ds.sq;


import com.srini.learning.algods.udemy.ds.ls.Node;

import lombok.Data;
import lombok.NonNull;
@Data
public class Stack<T> {
	
	private Node<T> top;
	private Node<T> bottom;
	

	public T peek() {
		
		return this.top.getValue();
	}
	
	public T pop() {
		if(top==null) {
			return null;
		}
		@NonNull
		T value = this.top.getValue();
		this.top=this.top.getNext();
		return value;
	}
	
	public boolean isEmpty() {
		return this.top==null;
	}
	
	public void push(T data) {
		if(this.top==null) {
			this.top=this.bottom=new Node<T>(data);
			return;
		}
		Node<T> oldTop = this.top;
		this.top=new Node<T>(data);
		this.top.setNext(oldTop);
	}
	
	public void printStack() {
		Node<T> temp=this.top;
		while(temp!=null) {
			System.out.print("-->"+temp.getValue());
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
}
