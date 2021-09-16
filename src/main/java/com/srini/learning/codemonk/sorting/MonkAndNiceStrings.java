package com.srini.learning.codemonk.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class MonkAndNiceStrings.
 *
 * @author srini
 */
public class MonkAndNiceStrings {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int inputSize = Integer.parseInt(br.readLine());
			String input[] = new String[inputSize];
			int niceValue[] = new int[inputSize];
			for (int i = 0; i < inputSize; i++) {
				String n = br.readLine();
				input[i] = n;
				int count = 0;
				int j = i;
				while (j > 0) {
					int v = n.compareTo(input[j - 1]);
					if (v > 0)
						count++;
					j--;
				}
				niceValue[i] = count;
			}
			for (int i = 0; i < niceValue.length; i++) {

				System.out.println(niceValue[i]);
			}
		}

	}

}
