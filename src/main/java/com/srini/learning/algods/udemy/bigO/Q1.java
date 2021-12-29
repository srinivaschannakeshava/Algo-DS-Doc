package com.srini.learning.algods.udemy.bigO;

import java.util.HashSet;

public class Q1 {
	// given an array and a sum find if the sum of pair equals sum
	// arr a=[1,2,3,4], sum=8
	//   a=[1,2,4,4], sum =8
	
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int a2[]= {1,2,4,4};
		System.out.println(isSumOfPairEqualsSumIfSortedArr(a, 8));
		System.out.println(isSumOfPairEqualsSumIfSortedArr(a2, 8));
		int a3[]= {};
		System.out.println(isSumOfPairEqualsSumIfSortedArr(a3, 8));
		int a4[]= {11,-3,3,1,6,4,8,9,7};
		System.out.println(isSumOfPairEqualsSumIfNonSortedArr(a4,8));
	}
	
	
	/**
	 * @param a
	 * @param sum
	 * @return
	 * 
	 * this problem solutinon has O(n) big o - linear scalable
	 */
	public static boolean isSumOfPairEqualsSumIfSortedArr(int a[],int sum) {
		int min= 0;
		int max= a.length-1;
		while((max-min)>0) {
			int pSum = a[max]+a[min];
			if(pSum ==sum) {
				return true;		
			}else if(pSum>sum) {
				max=max-1;
			}else {
				min=min+1;
			}
		}
		return false;
	}
	
	// even this 
	public static boolean isSumOfPairEqualsSumIfNonSortedArr(int a[],int sum) {
		HashSet lookUp = new HashSet<>();
//		lookUp.contains(lookUp);
		for(int val: a) {
			int diff = sum -val;
			if(lookUp.contains(val)) {
				System.out.println("val :"+val+" lookup : "+diff);
				return true;
			}else {
				lookUp.add(diff);
			}
		}
		return false;
	}

}
