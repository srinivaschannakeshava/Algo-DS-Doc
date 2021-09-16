package com.srini.learning.algods.sap;

import java.util.Scanner;

public class LevelEasy {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int noOfCases = s.nextInt();
			while (noOfCases > 0) {
				int r = s.nextInt(); // revenue without ad
				int e = s.nextInt(); // revenue with ad
				int c = s.nextInt(); // cost for revenue
				// if r > e-c --> do not advertize
				// if r < e-c --> advertize
				// if r == e-c --> doesnt matter
				int effRevWithAd = e - c;
				if (r > effRevWithAd)
					System.out.println("do not advertise");
				else if (r < effRevWithAd)
					System.out.println("advertise");
				else
					System.out.println("does not matter");
				noOfCases--;
			}
		}

	}

}
