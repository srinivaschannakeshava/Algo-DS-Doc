package com.srini.learning.algods.udemy.ds.array;

import java.util.Arrays;

/**
 * @author schannakesha
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.

		Example 1:
		
		Input: nums = [0,1,0,3,12]
		Output: [1,3,12,0,0]
		Example 2:
		
		Input: nums = [0]
		Output: [0]
 *
 */
public class Q5 {

	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
//		normalMethod(nums);
		swapMethod(nums);
		
	}

	private static void swapMethod(int[] nums) {
		int s=0,f=0;
		while(f<nums.length) {
			if(nums[f]==0) {
				f++;
				continue;
			}
			int temp=nums[s];
			nums[s]=nums[f];
			nums[f]=temp;
			s++;
			f++;
		}
		System.out.println(Arrays.toString(nums));
		
	}

	private static void normalMethod(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) 
				nums[count++]=nums[i];				
		}
		while(count<nums.length)
			nums[count++]=0;
		System.out.println(Arrays.toString(nums));
	}
}
