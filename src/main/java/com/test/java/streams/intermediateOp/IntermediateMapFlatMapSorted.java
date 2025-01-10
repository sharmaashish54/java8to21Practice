package com.test.java.streams.intermediateOp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateMapFlatMapSorted {

	public static void main(String[] args) {
		//map create one to one mapping bw elements in the stream.
		
		Stream.of("Ashish","Sharma","Kiara","Mysha").map(s->s.length())
		.forEach(System.out::println);
		
		
		List<String> list1 = Arrays.asList("Ashish","Sharma");
		List<String> list2 = Arrays.asList("Shefali","Sharma");
		
		List<List<String>> list = Arrays.asList(list1,list2);
		
		System.out.println(list);
		//Flatmap converts/merges two lists into one
		System.out.println(list.stream().flatMap(l->l.stream()).collect(Collectors.toList()));
		
		list.stream().flatMap(l->l.stream()).forEach(System.out::println);
		
		list.stream().sorted().peek(s-> System.out.print("s"+s));
	}

}
