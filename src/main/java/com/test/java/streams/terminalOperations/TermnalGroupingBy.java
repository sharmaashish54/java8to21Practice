package com.test.java.streams.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TermnalGroupingBy {

	public static void main(String[] args) {

		Stream<String> str1 = Stream.of("Alan","Ashish","David","Dude","Kiara","Mysha");
		
		Map<Integer, Set<String>> map = str1.collect(Collectors.groupingBy(s->s.length(),Collectors.toSet()));
		
		System.out.println(map);
		
		Stream<String> str2 = Stream.of("Alan","Ashish","David","Dude","Kiara","Mysha");
		TreeMap<Integer,List<String>> map2 = str2.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
		
		System.out.println(map2);
	}

}
