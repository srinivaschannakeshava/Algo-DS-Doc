package com.srini.learning.algods.udemy.ds.ls;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DNode<T>{
	T value;
	DNode<T> prev;
	DNode<T> next;
	
	public DNode(T value){
		this.value=value;
	}

}
