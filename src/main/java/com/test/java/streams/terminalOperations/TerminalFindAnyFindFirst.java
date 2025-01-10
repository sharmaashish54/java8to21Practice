package com.test.java.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalFindAnyFindFirst {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ashish","Ankur","Kiara","LAdvani");
		list.stream().findAny().filter(s->s.startsWith("L")).ifPresent(System.out::println);
		//FindAny is not a stable method , it doesnt give same output, more stable version is findFirst
		
		//Stream<String> sm2= Stream.of("Ashish","Ankur","Kiara","Advani");
		list.stream().findFirst().filter(s->s.startsWith("A")).ifPresent(System.out::println);
	}

}
