package com.srini.learning.algods.linkedList;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Node<T> {
	@NonNull
	T value;
	Node<T> next;
}
