package com.srini.learning.algods.udemy.bigO;

import java.util.LinkedList;
import java.util.Stack;

public class Q2 {

	public static void main(String[] args) {
		int a[]= {'a','b','c','d'};
		Stack<Character> charStack=new Stack<>();
		charStack.push('a');
		charStack.push('b');
		charStack.push('c');
		charStack.push('d');
		System.out.println(charStack);
		charStack.pop();
		System.out.println(charStack);

		LinkedList<Character> ll=new LinkedList<>();
		ll.push('a');
		ll.push('b');
		ll.push('c');
		ll.push('d');
		ll.pop();
		System.out.println(ll);
		ll.addFirst('d');
		ll.add('e');
		System.out.println(ll);
	}
}
