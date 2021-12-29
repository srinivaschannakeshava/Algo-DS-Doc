package com.srini.learning.algods.udemy.ds.tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree<Integer> bt=new BinaryTree<Integer>(15);
		bt.insert(6);
		bt.insert(71);
		bt.insert(4);
		bt.insert(10);
		bt.insert(50);
		bt.insert(89);
		bt.insert(2);
		bt.insert(5);
		bt.insert(23);
		bt.insert(86);
		bt.insert(97);
		bt.insert(60);
		bt.insert(7);
		bt.insert(11);
		bt.traverse();
		
	}
}
