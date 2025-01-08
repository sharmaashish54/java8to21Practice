package com.test.java;

public class TestJavaConcepts {

	static int x = 10;//static variables are associated with class

	public static void main(String[] args) {
		final int x = 5;// value of final variable cannot be changed
		int y = 15;//instance variable value, it is associated with object reference.

		TestJavaConcepts.x = 11;// value of static variable can be changed but the copy of this variable will
								// always be one.
		System.out.println(x);
		System.out.println(TestJavaConcepts.x);
		System.out.println(TestJavaConcepts.x+y);
	}

}
