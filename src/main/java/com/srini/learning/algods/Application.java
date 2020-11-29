package com.srini.learning.algods;

import com.srini.learning.algods.linkedList.LinkedList;
import com.srini.learning.algods.nodes.PlainNode;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		---------------------------------------
		System.out.println("---------------------------------------");
		System.out.println("Node block");
		// +---+------+
		// | 1 | NULL |
		// +---+------+
		PlainNode n1 = new PlainNode(Integer.valueOf(1));

		PlainNode n2 = new PlainNode(Integer.valueOf(2));
		// +---+-----+ +---+------+
		// | 1 | * --|->| 2 | NULL|
		// +---+-----+ +---+------+
		n1.setNext(n2);

		PlainNode n3 = new PlainNode(Integer.valueOf(3));
		// +---+-----+- +---+------+- +---+------+
		// | 1 | * --|->| 2 | *----|->| 3 | NULL |
		// +---+-----+- +---+------+- +---+------+
		n2.setNext(n3);

		n3.printNodeList();
		n2.printNodeList();
		n1.printNodeList();
		System.out.println("\n---------------------------------------");

//		---------------------------------------

		LinkedList<String> ls = new LinkedList<>();
		ls.addFirst("Hello");
		ls.addLast("Worlds");
		ls.addLast("Ending");
		ls.addLast("Tail");
		ls.addFirst("Srini here!!");
		ls.enumerate();
		System.out.println(ls.contains("Srini here!!"));
		System.out.println(ls.size());
		ls.removeFirst();
		ls.enumerate();
		System.out.println(ls.contains("Tail"));
		System.out.println(ls.size());
		ls.removeLast();
		ls.enumerate();
		System.out.println(ls.size());
		System.out.println(ls.contains("Tail"));
		System.out.println(ls.contains("Ending"));
		System.out.println(ls.contains("Hello"));
		System.out.println(ls.contains("Srini here!!"));
		ls.addFirst("Srini here!!");
		ls.addLast("Tail");
		ls.enumerate();
		ls.remove("Hello");
		ls.enumerate();
		ls.remove("Srini here!!");
		ls.enumerate();
		ls.remove("Tail");
		ls.enumerate();

		ls.clear();
		ls.enumerate();
		System.out.println(ls.size());
	}
}
