package com.test.java.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalAnyNoneAllMatch {

	public static void main(String[] args) {

		Stream<String> sm1= Stream.of("Ashish","Ankur","Kiara","Advani");
		Predicate<String> pr1 = s->s.startsWith("A");
		
		System.out.println(sm1.anyMatch(pr1)); 
		
		List<String> list = Arrays.asList("Abc","Adb","Cds");
		
		System.out.println(list.stream().allMatch(pr1)); 
		System.out.println(list.stream().noneMatch(pr1)); 
		
		
	}

}
