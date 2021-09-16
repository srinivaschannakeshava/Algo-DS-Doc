package com.srini.learning.algods.linkedList;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * Gets the count.
 *
 * @return the count
 */
@Getter
@Setter

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
public class LinkedList<T> {

	/** The head. */
	@Setter(AccessLevel.NONE)
	private Node<T> head;
	
	/** The tail. */
	@Setter(AccessLevel.NONE)
	private Node<T> tail;
	
	/** The count. */
	@Setter(AccessLevel.NONE)
	private int count = 0;

	/**
	 * Adds the first.
	 *
	 * @param value the value
	 */
	public void addFirst(T value) {
		addFirst(new Node<T>(value));
	}

	/**
	 * Adds the first.
	 *
	 * @param node the node
	 */
	private void addFirst(Node<T> node) {
		Node<T> temp = head;
		head = node;
		head.next = temp;
		count++;
		if (count == 1) {
			tail = head;
		}
	}

	/**
	 * Adds the last.
	 *
	 * @param value the value
	 */
	public void addLast(T value) {
		addLast(new Node<T>(value));
	}

	/**
	 * Adds the last.
	 *
	 * @param node the node
	 */
	private void addLast(Node<T> node) {
		Node<T> temp = tail;
		tail = node;
		if (temp == null)
			head = tail;
		else
			temp.next = node;
		count++;
	}

	/**
	 * Removes the first.
	 */
	public void removeFirst() {
		if (count != 0)
			head = head.next;
		count--;
		if (count == 0)
			tail = null;
	}

	/**
	 * Removes the last.
	 */
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

	/**
	 * Enumerate.
	 */
	public void enumerate() {
		Node<T> current = head;
		while (current != null) {
			System.out.print("-->" + current.getValue());
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * Contains.
	 *
	 * @param value the value
	 * @return true, if successful
	 */
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
/**
 * Removes the.
 *
 * @param value the value
 * @return true, if successful
 */
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

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return count;
	}

	/**
	 * Clear.
	 */
	public void clear() {
		head = null;
		tail = null;
		count = 0;
	}
}
