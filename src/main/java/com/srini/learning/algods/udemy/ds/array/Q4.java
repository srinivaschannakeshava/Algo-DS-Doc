package com.srini.learning.algods.udemy.ds.array;

/**
 * @author schannakesha
 *Given an integer array nums, find the contiguous subarray (containing at least one number) 
 *which has the largest sum and return its sum.
 *A subarray is a contiguous part of an array.
 *Example 1:

	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	Example 2:
	
	Input: nums = [1]
	Output: 1
	Example 3:
	
	Input: nums = [5,4,-1,7,8]
	Output: 23
 */
public class Q4 {

	public static void main(String[] args) {
		int a[]= {-2,1,-3,4,-1,2,1,-5,4},a2[]={5,4,-1,7,8};
		int max_here=0,max_so_far=a[0];
		for(int val:a) {
			max_here=max_here+val;
			if(max_here>max_so_far) {
				max_so_far=max_here;
			} if(max_here<0){
				max_here=0;
			}
			
		}
		System.out.println("Max_so_Far : "+max_so_far);
//		anotherSimpleWay(a);
		anotherSimpleWay(a2);

	}
	
	private static void anotherSimpleWay(int[] a) {
		int current=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			current=Math.max(a[i], current+a[i]);
			max=Math.max(max, current);
			
		}
		System.out.println(max);
	}

}
