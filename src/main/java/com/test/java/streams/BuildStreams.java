package com.test.java.streams;

import java.util.stream.Stream;

class Dog{};

public class BuildStreams {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		System.out.println("Count is :"+stream1.count());
		
		Stream<String> stream2 = Stream.of("Ashish","Sharma");
		System.out.println("Count is :"+stream2.count());
		
		Stream<Dog> stream3 = Stream.of(new Dog());
		System.out.println("Count is :"+stream3.count());
		
	}

}
