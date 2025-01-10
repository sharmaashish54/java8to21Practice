package com.test.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		Double[] numbers = {1.1,2.1,3.8,4.9};
		Stream<Double> integers = Arrays.stream(numbers);
		System.out.println("count of numbers : "+integers.count());
		
		List<String> nameList = Arrays.asList("Ashish","Mysha","Shefali","Kiara");
		Stream<String> listStream = nameList.stream();
		System.out.println("count of names : "+listStream.count());
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Ashish", 36); map.put("Shefali", 33); map.put("Mysha", 7); map.put("Kiara",2);
		
		System.out.println("count of elements in map :"+map.entrySet().stream().count());
		
		
	}

}
