package com.srini.learning.codemonk.arrays;

import java.util.Arrays;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class MonkAndRotation.
 */
public class MonkAndRotation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTest = s.nextInt(); // Reading input from STDIN
		for (int i = 0; i < noOfTest; i++) {
			int inputSize = s.nextInt();
			int noOfRotation = s.nextInt();
			int dataArray[] = new int[inputSize];
			if (inputSize < noOfRotation)
				noOfRotation = noOfRotation % inputSize;

			for (int x = noOfRotation; x < inputSize; x++) {
				dataArray[x] = s.nextInt();
			}

			for (int j = 0; j < noOfRotation; j++) {
				dataArray[j] = s.nextInt();
			}

			// for(int k=0; k<noOfRotation; k++){
			// int last=dataArray[inputSize-1];
			// for(int l=inputSize-1; l>0; l--){
			// dataArray[l]=dataArray[l-1];
			// }
			// dataArray[0]=last;
			// }
			// for(int m=0;m<inputSize;m++){
			System.out.println(Arrays.toString(dataArray).replace("[", "").replace("]", "").replace(",", ""));
		}

	}
}
