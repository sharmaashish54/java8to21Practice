package com.test.java.streams.primitiveStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingObjectStreams {

	public static void main(String[] args) {
		DoubleStream dbl = Stream.of("Ashish","Shefali","Mysha","Kiara").mapToDouble(s->s.length());
	dbl.forEach(System.out::println);
	
	
	IntStream intstream = Stream.of("Ashish","Shefali","Mysha","Kiara").mapToInt(s1->s1.length());
	intstream.forEach(System.out::println);
	}
	

}
