package com.test.java.streams.terminalOperations;

import java.util.stream.Stream;

public class TerminalReduce {

	public static void main(String[] args) {

		Stream<String> str1 = Stream.of("A","S","H","I","S","H");
		
		String name = str1.reduce("", (s1, s2)->s1+s2);
		System.out.println(name);
		
		Stream<Integer> str2 = Stream.of(2,3,4);
		int product = str2.reduce(1,(a,b)-> a*b);
		System.out.println(product);
		
		
	}

}
