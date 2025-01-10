package com.test.java.streams.terminalOperations;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalCollect {

	public static void main(String[] args) {

		StringBuilder word = Stream.of("Adj","us","tab","le").collect(()-> new StringBuilder(),
				(sb,str)->sb.append(str),
				(sb1,sb2)->sb1.append(sb2));
		
		System.out.println(word);
		
		
		String s = Stream.of("Adj","us","tab","le").collect(Collectors.joining(","));
		System.out.println(s);
		
		Double i = Stream.of("Adj","us","tab","le").collect(Collectors.averagingInt(s1->s1.length()));
		System.out.println(i);
		
		//convert stream to map using toMap function
		
		//map:number of characters in the string, since for 2 of the elements the key value(length) is same,
		//hence to avoid exception, merge both the values under one key
		Map<Integer,String> map = Stream.of("cake","buiscuit","tart","cake")
				.collect(Collectors.toMap(s2->s2.length(),s3->s3, (s1,s2)->s1+","+ s2));
		System.out.println(map);//Here default hashmap is created
		
		
		Map<String, Integer> map2 = Stream.of("cake", "buiscuit", "tart")
		        .collect(Collectors.toMap(
		                s4 -> s4,                      // Key Mapping Function
		                s5 -> s5.length(),             // Value Mapping Function
		                (len1, len2) -> len1 + len2,   // Merge Function
		                () -> new TreeMap<>()          // Map Supplier
		        ));//here explicitly treemap is created 
				   //hence the keys will be in order 
		
		System.out.println(map2);
		System.out.println(map2.getClass());
		
	}

}
