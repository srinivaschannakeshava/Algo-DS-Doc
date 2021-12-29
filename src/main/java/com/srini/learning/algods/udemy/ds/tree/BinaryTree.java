package com.srini.learning.algods.udemy.ds.tree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

@Data
public class BinaryTree<T extends Comparable<T>> {
	Bnode<T> root;

	public BinaryTree(T value) {
		this.root = new Bnode<T>(value);
	}

	public void traverse() {
		printNode(root);
		jsonTree();
	}

	public void insert(T value, Bnode<T> node) {

		if (root == null) {
			this.root = new Bnode<T>(value);
			return;
		} else {
			if (node != null) {
				int c2 = node.value.compareTo(value);
				if (c2 < 0) {
					Bnode<T> right = node.right;
					if (right != null)
						insert(value, right);
					else
						node.setRight(new Bnode<T>(value));
				} else {
					Bnode<T> left = node.left;
					if (left != null)
						insert(value, left);
					else
						node.setLeft(new Bnode<T>(value));
				}
			}
		}

	}

	public void insert(T val) {
		insert(val, root);
	}

	public void printNode(Bnode<T> node) {
		System.out.println("----------");
		Bnode<T> left = null;
		Bnode<T> right = null;
		if (node != null) {
			System.out.println("  "+node.value);

			System.out.println("//  \\\\");
			if (node.left != null) {
				System.out.print(node.left.value);
				left = node.left;
			}
			if (node.right != null) {
				System.out.print("      "+node.right.value);
				System.out.println();
				right = node.right;
			}
			if (right != null)
				printNode(right);
			if (left != null)
				printNode(left);
		}
	}
	
	private void jsonTree(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(root);
        System.out.println(jsonString);
        
        ObjectMapper om=new ObjectMapper();
        try {
			System.out.println(om.writeValueAsString(root));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
