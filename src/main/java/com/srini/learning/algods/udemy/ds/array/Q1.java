package com.srini.learning.algods.udemy.ds.array;

//Reverse a string
public class Q1 {

	public static void main(String[] args) {
		String s1="abcdefgh";
		normalReversal(s1);
		midPointReversal(s1);
	}

	//normal way o(n) complexity
	private static void normalReversal(String s1) {
		char s2[]=new char[s1.length()];
		for(int i=s1.length();i>0;i--) {
			s2[s1.length()-i]=s1.charAt(i-1);
		}
		System.out.println(new String(s2));
	}
	
	//O(n/2)
	private static void midPointReversal(String s1) {
		int len = s1.length();
//		int rem=len%2;
		int mid=(len/2);
		char[] rs=new char[len];
//		if(rem==0) {
			//even size
			for(int i=0;i<=mid;i++) {
				rs[i]=s1.charAt(len-1-i);
				rs[len-1-i]=s1.charAt(i);
			}
			System.out.println(rs);
//		}else {
//			for(int i=0;i<=mid;i++) {
//				rs[i]=s1.charAt(len-1-i);
//				rs[len-1-i]=s1.charAt(i);
//			}
//			System.out.println(rs);
//		}
		
	} 

	
}
