package com.srini.learning.codemonk.arrays;

import java.util.Scanner;

/**
 * The Class MinAndXorOr.
 */
public class MinAndXorOr {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			int noOfInputs = in.nextInt();
			for (int i = 0; i < noOfInputs; i++) {
				int arraySize = in.nextInt();
				int a[] = new int[arraySize];
				for (int j = 0; j < arraySize; j++) {
					a[j] = in.nextInt();
				}
				Integer minVal = null;
				for (int k = 0; k < arraySize; k++) {
					for (int l = k + 1; l < arraySize; l++) {
						int val = getMinAndXorOrVal(a[k], a[l]);
						if (minVal == null || val < minVal)
							minVal = val;

						System.out.println(val + "-->index(" + k + "," + l + ")" + "-->val(" + a[k] + "," + a[l] + ")");

					}
				}
				System.out.println(minVal);

			}
		}
	}

	/**
	 * Gets the min and xor or val.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the min and xor or val
	 */
	static int getMinAndXorOrVal(int x, int y) {
		return (x & y) ^ (x | y);
	}

}
