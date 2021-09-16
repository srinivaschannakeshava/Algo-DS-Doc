package com.srini.learning.codemonk.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class ExactlyNoOfTimes {

	public static void main(String[] args) {

		int[] A = { 3, 8, 2, 3, 3, 2 };
		ArrayList<Integer> condSat = new ArrayList<>();
		ArrayList<Integer> totalArray = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());
		Set<Integer> collect = totalArray.stream().collect(Collectors.toSet());
		for (Integer a : collect) {
			int freq = Collections.frequency(totalArray, a);
			if (freq == a) {
				condSat.add(a);
			}
		}
		if (!condSat.isEmpty())
			System.out.println(condSat);
		System.out.println(Collections.max(condSat));
	}

}
