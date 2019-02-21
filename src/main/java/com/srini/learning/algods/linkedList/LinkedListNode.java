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
public class LinkedListNode<T> {
	@NonNull
	T value;
	LinkedListNode<T> next;
}
