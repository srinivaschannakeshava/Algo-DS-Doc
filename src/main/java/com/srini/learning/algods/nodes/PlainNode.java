package com.srini.learning.algods.nodes;

import lombok.AllArgsConstructor;
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
 * Instantiates a new plain node.
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

/**
 * Instantiates a new plain node.
 *
 * @param value the value
 * @param next the next
 */
@AllArgsConstructor
public class PlainNode {
	
	/** The value. */
	@NonNull
	Object value;
	
	/** The next. */
	PlainNode next;

	/**
	 * Prints the node list.
	 */
	public void printNodeList() {
		PlainNode n = this;
		while (n != null) {
			System.out.print("-->");
			System.out.print(n.value);
			n = n.next;
		}
		System.out.println("");
	}

	/**
	 * Prints the node list.
	 *
	 * @param n the n
	 */
	public void printNodeList(PlainNode n) {
		while (n != null) {
			System.out.print("-->");
			System.out.println(n.value);
			n = n.next;
		}
		System.out.println("");
	}
}
