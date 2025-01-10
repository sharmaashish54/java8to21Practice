package com.test.java.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalMinMaxCount {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ashish","Shefali","Mysha","Kiara");
		System.out.println(list.stream().count());
		
		Optional<String> min = list.stream().min((s1,s2)-> s1.length()-s2.length());
		min.ifPresent(System.out::println);
		
		Optional<Integer> max = Stream.of(1,4,9,3,6).max((i1,i2)-> i1-i2);
		max.ifPresent(System.out::println);
		

	}

}
