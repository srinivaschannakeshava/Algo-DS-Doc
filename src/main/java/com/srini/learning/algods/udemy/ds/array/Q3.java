package com.srini.learning.algods.udemy.ds.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author schannakesha
 *
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Example 1:
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Output: Because nums[0] + nums[1] == 9, we return [0, 1].
	Example 2:
	
	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:
	
	Input: nums = [3,3], target = 6
	Output: [0,1]
 *
 */
public class Q3 {
	public static void main(String[] args) {
		
		int a[]= {2,7,11,15}, a2[]= {3,2,4}, a3[]= {3,3};
		int tar=9,tar2= 6,tar3=6;
		
		System.out.println(Arrays.toString(findIndexGivenTarget(a, tar)));
		System.out.println(Arrays.toString(findIndexGivenTarget(a2, tar2)));
		System.out.println(Arrays.toString(findIndexGivenTarget(a3, tar3)));
	}

	private static int[] findIndexGivenTarget(int[] a, int tar) {
		HashMap<Integer,Integer> lk=new HashMap();
		for(int i=0;i<a.length;i++) {
			int diff= tar-a[i];
			if(lk.containsKey(a[i])) {
				return new int[] {lk.get(a[i]),i};
			}else {
				lk.put(diff, i);
			}
			
		}
		return null;
	}
	

}
