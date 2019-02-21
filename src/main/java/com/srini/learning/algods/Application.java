package com.srini.learning.algods;

import com.srini.learning.algods.linkedList.LinkedList;
import com.srini.learning.algods.nodes.Node;

public class Application {

	public static void main(String[] args) {

		System.out.println("Main block");
		Node n1 = new Node(Integer.valueOf(1));
		Node n2 = new Node(Integer.valueOf(2), n1);
		Node n3 = new Node(Integer.valueOf(3), n2);
		System.out.println(n3);

		LinkedList<String> ls = new LinkedList<>();
		ls.addFirst("Hello");
		ls.addLast("Worlds");
		ls.addLast("Ending");
		ls.addLast("Tail");
		ls.addFirst("Srini here!!");
		System.out.println(ls.getHead());
		ls.removeFirst();
		System.out.println(ls.getTail());
		ls.removeLast();
		System.out.println(ls.getTail());
	}
}
