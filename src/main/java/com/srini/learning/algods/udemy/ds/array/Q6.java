package com.srini.learning.algods.udemy.ds.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author schannakesha
 *
 *Given an integer array nums, return true if any value appears at least twice in the array, 
 *and return false if every element is distinct.

	Example 1:
	
	Input: nums = [1,2,3,1]
	Output: true
	Example 2:
	
	Input: nums = [1,2,3,4]
	Output: false
	Example 3:
	
	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
 */
public class Q6 {
	public static void main(String[] args) {
		int nums[]= {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

	private static boolean containsDuplicate(int[] nums) {
		HashSet set=new HashSet();
		for(int val:nums) {
			if(set.contains(val))
				return true;
			else
				set.add(val);
		}
		return false;
	}
	
	private static boolean containsDuplicate2(int[] nums) {
	Arrays.sort(nums);
    for(int i=0; i<nums.length-1; i++){
		if (nums[i] == nums[i + 1]) {
			return true;
		}
    }
    return false;
	}
}
