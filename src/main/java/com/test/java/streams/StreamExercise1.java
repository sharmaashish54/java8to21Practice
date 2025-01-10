package com.test.java.streams;

import java.util.stream.Stream;

public class StreamExercise1 {

	public static void main(String[] args) {

		//Stream operation = source.intermediate_operation.Terminal_Function.
		//Stream are lazy, it doesn't load all the data at once instead it 
		//loads some data at intervals , until terminal operation is executed.
		
		Stream.of("Ashish","Mysha","Abhay","Ashok","Shefali").map(s->{
			System.out.println("map :"+s);
			return s.toUpperCase();
		}).anyMatch(s->{
			System.out.println("terminal: "+s);
			return s.startsWith("A");
		});//output : map :Ashish terminal: ASHISH

		
	}

}
