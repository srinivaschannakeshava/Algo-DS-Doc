package com.srini.learning.codemonk.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class MonkAndSuffixSort {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			String[] split = input.split(" ");
			String iString = split[0];
			int suffix = Integer.parseInt(split[1]);
			SortedSet<String> sSet = new TreeSet<>();
			for (int i = 0; i < iString.length(); i++) {
				sSet.add(iString.substring(i));
			}
			System.out.println((sSet.toArray())[suffix - 1]);

		}

	}

}
