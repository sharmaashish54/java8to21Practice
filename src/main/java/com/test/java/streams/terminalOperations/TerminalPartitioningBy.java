package com.test.java.streams.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalPartitioningBy {

	public static void main(String[] args) {

		Stream<String> str1 = Stream.of("Ashish","Sharma","Shefali","Mysha","Kiara");
		Map<Boolean, List<String>> map = str1.collect(Collectors.partitioningBy(s->s.startsWith("A")));
		System.out.println(map);
		
		Stream<String> str2 = Stream.of("Ashish","Sharma","Shefali","Mysha","Kiara");
		Map<Boolean, List<String>> map1 =str2.collect(Collectors.partitioningBy(s->s.length()<6));
		System.out.println(map1);
		
		
		Stream<String> str3 = Stream.of("Ashish","Ashish","Sharma","Shefali","Mysha","Kiara");
		//Using set as collectors output will not allow duplicates
		Map<Boolean, Set<String>> map2 =str3.collect(Collectors.partitioningBy(s->s.length()<6,Collectors.toSet()));
		System.out.println(map2);
	}
	
	

}
