package com.test.java.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
	getAverage(1,2,3,4,6,1,3234,33).ifPresent(System.out::println);
	System.out.println(getAverage().orElse(Double.NaN));
		
	}

	public static Optional<Double> getAverage(int... scores){
		if(scores.length==0) return Optional.empty();
		int sum=0;
		for(int s:scores) sum += s;
		return Optional.of((double)sum/scores.length);
		
	}
}
