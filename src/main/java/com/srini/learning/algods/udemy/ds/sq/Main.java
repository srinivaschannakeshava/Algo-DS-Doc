package com.srini.learning.algods.udemy.ds.sq;

public class Main {

	public static void main(String[] args) {
		Stack<String> ss=new Stack<>();
		ss.push("Google");
		ss.push("Facebook");
		ss.push("Twitter");
		ss.printStack();
		System.out.println(ss.pop());
		ss.printStack();
		System.out.println(ss.pop());
		ss.printStack();
		System.out.println(ss.pop());
		ss.printStack();
		System.out.println(ss.pop());
		
		Queues<String> qs=new Queues<>();
		qs.enqueue("Google");
		qs.enqueue("Facebook");
		qs.enqueue("Twitter");
		qs.printQueue();
		System.out.println(qs.dequeue());
		qs.printQueue();
		System.out.println(qs.dequeue());
		qs.printQueue();
		System.out.println(qs.dequeue());
		qs.printQueue();
		System.out.println(qs.dequeue());
		
		Q1<String> q1=new Q1<>();
		q1.enqueue("Google");
		q1.enqueue("Facebook");
		q1.enqueue("Twitter");
		q1.printQueue();
		System.out.println(q1.dequeue());
		q1.enqueue("Instagram");
		q1.printQueue();
		System.out.println(q1.dequeue());
		q1.enqueue("YouTube");
		q1.printQueue();
		System.out.println(q1.dequeue());
		q1.printQueue();
		System.out.println(q1.dequeue());
		
	}
	

}
