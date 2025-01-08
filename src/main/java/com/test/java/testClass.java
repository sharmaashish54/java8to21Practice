package com.test.java;

public class testClass {

	public static void main(String[] args) {
		int i =0;
		int j = i;
		j=++i +j;
		System.out.println(i+"-"+j);
		
		String str = "abc";
		String str2 = "abc";
		
		System.out.println(str.equals(str2));
		System.out.println(str == str2);
		System.out.println(str.intern().equals(str2.intern()));
	}

}
