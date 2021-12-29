package com.srini.learning.algods.udemy.ds.sq;

import com.srini.learning.algods.udemy.ds.ls.Node;

public class Queues<T> {
	private Node<T> first;
	private Node<T> last;

	public void enqueue(T data) {
		Node<T> n = new Node<T>(data);
		if (this.first == null) {
			this.first = this.last = n;
			return;
		}
		this.last.setNext(n);
		this.last=n;
	}

	public T dequeue() {
		if (this.first == null)
			return null;
		T value = this.first.getValue();
		this.first = this.first.getNext();
		return value;
	}

	public void printQueue() {
		Node<T> temp = this.first;
		while (temp != null) {
			System.out.print("-->" + temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}

}
