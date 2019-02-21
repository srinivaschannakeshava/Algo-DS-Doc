package com.srini.learning.algods.linkedList;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LinkedList<T> {

	@Setter(AccessLevel.NONE)
	private LinkedListNode<T> head;
	@Setter(AccessLevel.NONE)
	private LinkedListNode<T> tail;
	@Setter(AccessLevel.NONE)
	private int count = 0;

	public void addFirst(T value) {
		addFirst(new LinkedListNode<T>(value));
	}

	private void addFirst(LinkedListNode<T> node) {
		LinkedListNode<T> temp = head;
		head = node;
		head.next = temp;
		count++;
		if (count == 1) {
			tail = head;
		}
	}

	public void addLast(T value) {
		addLast(new LinkedListNode<T>(value));
	}

	private void addLast(LinkedListNode<T> node) {
		LinkedListNode<T> temp = tail;
		tail = node;
		if (temp == null)
			head = tail;
		else
			temp.next = node;
		count++;
	}

	public void removeFirst() {
		if (count != 0)
			head = head.next;
		count--;
		if (count == 0)
			tail = null;
	}

	public void removeLast() {
		if (count == 1) {
			head = tail = null;
			count--;
		} else if (count > 1) {
			tail = tail.next;
			count--;
		}
	}

	public int size() {
		return count;
	}
}
