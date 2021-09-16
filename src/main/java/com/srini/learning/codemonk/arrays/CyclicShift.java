package com.srini.learning.codemonk.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class CyclicShift.
 */
public class CyclicShift {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int noOfCases = Integer.parseInt(br.readLine());

			for (int i = 0; i < noOfCases; i++) {
				String[] sr = br.readLine().split(" ");
				int sizeOfArray = Integer.parseInt(sr[0]);
				int k = Integer.parseInt(sr[1]);
				String a = br.readLine();
// find max value--> in one loop how many max value--> divide how many time max is required --> manual shift to get remaining count
				double maxValue = getDecimalValue(a);
				int count = 0;
				int initalCountForMax = 0;
				String maxBinary = a;
				// 9223372036854775807 9223372036854775807
				String b = a;

				// find the max array value
				for (int x = 0; x <= sizeOfArray; x++) {
					count++;
					b = shiftArrayLeft(b);
					double decimalValue = getDecimalValue(b);
					if (Double.compare(maxValue, decimalValue) < 0) {
						maxValue = decimalValue;
						maxBinary = b;
						initalCountForMax = count;
					}
				}
				// check how many max for one rotation of string
				int maxInOneRot = 0;
				for (int x = 0; x < sizeOfArray; x++) {
					b = shiftArrayLeft(b);
					if (maxBinary.equalsIgnoreCase(b))
						maxInOneRot = maxInOneRot + 1;
				}

				k = k - 1;

				// k times required divide by (no of time per size rotation) * size
				long j = new Long(sizeOfArray) * new Long(k / maxInOneRot);
				int r = k % maxInOneRot;

				if (r == 0) {
					long totalShift = initalCountForMax + j;
					System.out.println(totalShift);
				} else {
					int addiCount = 0;
					b = maxBinary;
					int t = 0;
					while (r != 0) {
						addiCount = addiCount + 1;
						b = shiftArrayLeft(b);
						if (maxBinary.equalsIgnoreCase(b)) {
							r--;
						}

					}
					long totalShift = initalCountForMax + addiCount + j;
					System.out.println(totalShift);
				}

			}
		}

	}

	/**
	 * Gets the decimal value.
	 *
	 * @param binary the binary
	 * @return the decimal value
	 */
	static double getDecimalValue(String binary) {
		double result = 0;
		char[] bChar = binary.toCharArray();
		int size = bChar.length;
		for (int i = 0; i < size; i++)
			switch (bChar[i]) {
			case '1':
				result = result + Math.pow(2, size - i - 1);
				break;
			default:
			}

//		if (bChar[i] == '1')
		return result;
	}

	/**
	 * Shift array left.
	 *
	 * @param newBinary the new binary
	 * @return the string
	 */
	static String shiftArrayLeft(String newBinary) {
		return newBinary.substring(1) + newBinary.substring(0, 1);

	}
}
