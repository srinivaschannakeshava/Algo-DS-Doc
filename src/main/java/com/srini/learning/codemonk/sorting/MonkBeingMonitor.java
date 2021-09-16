package com.srini.learning.codemonk.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonkBeingMonitor {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int testSize = s.nextInt();
			for (int i = 0; i < testSize; i++) {
				Map<Integer, Integer> hsm = new HashMap<Integer, Integer>();
				int classSize = s.nextInt();
				for (int j = 0; j < classSize; j++) {
					Integer h = s.nextInt();
					if (hsm.containsKey(h)) {
						hsm.put(h, hsm.get(h) + 1);
					} else {
						hsm.put(h, 1);
					}
				}
//				System.out.println(hsm);
				Integer min = Collections.min(hsm.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
				Integer max = Collections.max(hsm.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
				int diff = max - min;
				if (diff > 0)
					System.out.println(diff);
				else
					System.out.println(-1);
			}

		}
	}

}
