package com.srini.learning.algods.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (num) -> (num % 2 != 0) ? true : false;
	}

	public PerformOperation isPrime() {
		return (num) -> {
			if (num < 1)
				return false;
			return !IntStream.range(2, num / 2).anyMatch(n -> num % n == 0);
		};
	}

	public PerformOperation isPalindrome() {
		return (num) -> {
			int reversedInteger = 0, remainder, originalInteger;
			originalInteger = num;
			while (num != 0) {
				remainder = num % 10;
				reversedInteger = reversedInteger * 10 + remainder;
				num /= 10;
			}
			return (originalInteger == reversedInteger) ? true : false;

		};
	}
}

public class MapFunction {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}