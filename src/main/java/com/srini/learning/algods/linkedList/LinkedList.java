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
	private Node<T> head;
	@Setter(AccessLevel.NONE)
	private Node<T> tail;
	@Setter(AccessLevel.NONE)
	private int count = 0;

	public void addFirst(T value) {
		addFirst(new Node<T>(value));
	}

	private void addFirst(Node<T> node) {
		Node<T> temp = head;
		head = node;
		head.next = temp;
		count++;
		if (count == 1) {
			tail = head;
		}
	}

	public void addLast(T value) {
		addLast(new Node<T>(value));
	}

	private void addLast(Node<T> node) {
		Node<T> temp = tail;
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
		if (count != 0) {
			if (count == 1) {
				head = tail = null;
			} else {
				Node<T> current = head;
				while (current.next != tail) {
					current = current.next;
				}
				current.next = null;
				tail = current;
			}
			count--;
		}

	}

	public void enumerate() {
		Node<T> current = head;
		while (current != null) {
			System.out.print("-->" + current.getValue());
			current = current.next;
		}
		System.out.println();
	}

	public boolean contains(T value) {
		Node<T> current = head;
		while (current != null) {
			if (current.value.equals(value))
				return true;
			current = current.next;
		}

		return false;
	}

//	There are 3 cases here 
//	1) empty list - do nothing 
//	2) single node- previous is null 
//	3) many node 
//	    a) remove first
//	    b) remove middle or last - incase of last update the tail
//				
	public boolean remove(T value) {
		Node<T> previous = null;
		Node<T> current = head;
		while (current != null) {
			if (current.value.equals(value)) {
				if (previous != null) {
					// case 3b
					previous.next = current.next;
					if (current.next == null)
						tail = previous;
					count--;
				} else {
					// case 2 or 3a
					removeFirst();
				}
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

	public int size() {
		return count;
	}

	public void clear() {
		head = null;
		tail = null;
		count = 0;
	}
}
