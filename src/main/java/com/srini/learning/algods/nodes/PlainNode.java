package com.srini.learning.algods.nodes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@AllArgsConstructor
public class PlainNode {
	@NonNull
	Object value;
	PlainNode next;

	public void printNodeList() {
		PlainNode n = this;
		while (n != null) {
			System.out.print("-->");
			System.out.print(n.value);
			n = n.next;
		}
		System.out.println("");
	}

	public void printNodeList(PlainNode n) {
		while (n != null) {
			System.out.print("-->");
			System.out.println(n.value);
			n = n.next;
		}
		System.out.println("");
	}
}
