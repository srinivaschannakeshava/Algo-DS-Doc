package com.srini.learning.algods.udemy.ds.sq;

import com.srini.learning.algods.udemy.ds.ls.Node;

//Create Queue using stacks
public class Q1<T> {

	Stack<T> s1 = new Stack<>();
	Stack<T> s2 = new Stack<>();

	public void enqueue(T data) {
		while (!s1.isEmpty())
			s2.push(s1.pop());
		s1.push(data);
		while (!s2.isEmpty())
			s1.push(s2.pop());
	}
	
	public T dequeue() {
		return s1.pop();
	}

	public void printQueue() {
		Node<T> temp = s1.getTop();
		while (temp != null) {
			System.out.print("-->" + temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	

}
