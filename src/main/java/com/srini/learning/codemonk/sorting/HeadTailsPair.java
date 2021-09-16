package com.srini.learning.codemonk.sorting;

public class HeadTailsPair {

	public static void main(String[] args) {

		int a[] = { 0, 1, 0, 1, 0 };

		int len = a.length;
//		check shifts for 1,0
		int seq1 = 0;
		int seq2 = 0;
		for (int i = 0; i < len; i = i + 2) {
			if (a[i] != 1) {
				seq1 = seq1 + 1;
			}
			if (a[i] != 0) {
				seq2 = seq2 + 1;
			}
		}
		for (int i = 1; i < len; i = i + 2) {
			if (a[i] != 0) {
				seq1 = seq1 + 1;
			}
			if (a[i] != 1) {
				seq2 = seq2 + 1;
			}
		}

		int min = (seq1 < seq2) ? seq1 : seq2;
		System.out.println(min);

	}

}
