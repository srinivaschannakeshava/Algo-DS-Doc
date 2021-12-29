package com.srini.learning.algods.udemy.ds.array;

import java.util.Arrays;

//Merge Sorted array
public class Q2 {

	//O(n) complexity
	public static void main(String[] args) {
		// Array1 -[0,3,4,31] , Array2[4,6,30]
		//output [0,3,4,4,6,30,31]
		
		int [] a1= {1,2,5,8};
		int a2[]= {0,3,4,6};
		int i = 0,j=0;
		int ma[]=new int[a1.length+a2.length];
		if(a1.length==0) {
			ma=a2;
		}
		if(a2.length==0) {
			ma=a1;
		}
		while(i <a1.length && j<a2.length) {
			if(a1[i]<a2[j]) {
				ma[i+j]=a1[i];
				i++;
				if(i==a1.length) {
					while(j<a2.length) {
						ma[i+j]=a2[j];
						j++;
					}
				}
			}else {
				ma[i+j]=a2[j];
				j++;
				if(j==a2.length) {
					while(i<a1.length) {
						ma[i+j]=a1[i];
						i++;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(ma));
		

	}

}
