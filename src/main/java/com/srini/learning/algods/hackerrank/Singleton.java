package com.srini.learning.algods.hackerrank;

class Singleton {
	public String str;
	private static Singleton s;

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		if (null == s)
			s = new Singleton();
		return s;
	}

}
