package com.srini.learning.codemonk.sorting;

import java.util.Arrays;

public class MinimumMinValue {

	public static void main(String[] args) {

		int a[] = { 1, 3, 6, 4, 1, 2 };

		System.out.println(getMinVal(a));
	}

	private static int getMinVal(int[] a) {

		int smallestInt = 1;

		if (a.length == 0)
			return smallestInt;

		Arrays.sort(a);

		if (a[0] > 1)
			return smallestInt;
		if (a[a.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;

	}

}
