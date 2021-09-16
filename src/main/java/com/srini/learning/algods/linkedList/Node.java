package com.srini.learning.algods.linkedList;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * Gets the next.
 *
 * @return the next
 */
@Getter

/**
 * Sets the next.
 *
 * @param next the new next
 */
@Setter

/**
 * Instantiates a new node.
 *
 * @param value the value
 */
@RequiredArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
public class Node<T> {
	
	/** The value. */
	@NonNull
	T value;
	
	/** The next. */
	Node<T> next;
}
