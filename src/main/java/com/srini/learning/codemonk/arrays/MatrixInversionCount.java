package com.srini.learning.codemonk.arrays;

import java.util.Scanner;

/**
 * The Class MatrixInversionCount.
 */
public class MatrixInversionCount {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int noOfCases = s.nextInt();
			for (int z = 0; z < noOfCases; z++) {
				System.out.println("Enter the matrix size : ");
				int matrixSize = s.nextInt();
				int matrix[][] = new int[matrixSize][matrixSize];
				for (int x = 0; x < matrixSize; x++) {
					for (int y = 0; y < matrixSize; y++) {
						matrix[x][y] = s.nextInt();
					}
				}
				int count = 0;
				for (int x = 0; x < matrixSize; x++) {
					for (int y = 0; y < matrixSize; y++) {
						for (int x2 = x; x2 < matrixSize; x2++) {
							for (int y2 = y; y2 < matrixSize; y2++) {
								if (matrix[x][y] > matrix[x2][y2])
									count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}
	}

}
