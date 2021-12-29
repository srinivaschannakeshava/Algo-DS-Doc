package com.srini.learning.algods.udemy.ds.ls;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
	
	public Node(T value) {
		this.value=value;
	}
	
	T value;
	Node<T> next;
}
