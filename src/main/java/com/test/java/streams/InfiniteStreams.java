package com.test.java.streams;

import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {

		Stream<Integer> st1 = Stream.generate(()->{
			return (int) Math.random()*10;
		}).limit(10);
		//here limit is used to make it finite
		//limit is short circuiting intermediate operation
		
		st1.forEach(System.out::println);
		
		Stream<Integer> st2 = Stream.iterate(2, n->2+n).limit(10);
		st2.forEach(System.out::println);
		
		

}
}
