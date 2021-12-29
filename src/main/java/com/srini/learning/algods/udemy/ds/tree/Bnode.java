package com.srini.learning.algods.udemy.ds.tree;

import lombok.Data;

@Data
public class Bnode<T extends Comparable<T>> {
	
	public Bnode(T value) {
		this.value=value;
	}

	T value;
	
	Bnode<T> right;
	
	Bnode<T> left;
}
