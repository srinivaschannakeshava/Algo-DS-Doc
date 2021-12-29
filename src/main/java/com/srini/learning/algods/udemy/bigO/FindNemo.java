package com.srini.learning.algods.udemy.bigO;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FindNemo {

	public static void main(String[] args) {
		String nu=null;
		System.out.println("--->"+nu.equals("Hello"));
		String a[]= new String[10];
		Arrays.fill(a, "Nemo");
		Long startTimeNanos = System.nanoTime();
//		for(String arr: a) {
//		}
		Arrays.stream(a).forEach(ar->find(ar));
		
		System.out.println("TimeTaken : "+TimeUnit.MILLISECONDS.convert((System.nanoTime()-startTimeNanos), TimeUnit.NANOSECONDS));
	}

	private static void find(String a) {
		if(a.equalsIgnoreCase("nemo"))
			System.out.println("Hi Nemo!!");
	}
	
}
