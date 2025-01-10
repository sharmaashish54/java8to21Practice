package com.test.java.streams.intermediateOp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateFilterDistinctLimit {

	public static void main(String[] args) {

		//Unlike a terminal operation , intermediate operation produces a stream.
		Stream<String> str1 = Stream.of("India","Australia","Europe","United States");
		
		List<String> filterList = str1.filter(s->s.length()>5).collect(Collectors.toList());
		filterList.stream().forEach(System.out::println);
		
		Stream<Integer> str2 = Stream.of(2,4,5,1,97,718);
		
		//Even numbers
		str2.filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
	
		
		List<Integer> numberList = new ArrayList<>();
		for(int i=1;i<101;i++) {
			numberList.add(i);
		}
		//Filter prime numbers
		numberList.stream().filter(i -> BigInteger.valueOf(i).isProbablePrime(10)).collect(Collectors.toList()).forEach(System.out::print);
	
	
		Stream<String> str3= Stream.of("eagle","eagle","Eagle");
		str3.peek(s->System.out.println("1."+s))
		.distinct()//eagle is not displayed again
		.forEach(s->System.out.println("2."+s));
		
		
		Stream.of(11,22,33,44,55,66,77,88,99)
				.peek(s->System.out.println("A -"+s))
				.filter(z -> z>40)
				.peek(s->System.out.println("B -"+s))
				.limit(2).forEach(s->System.out.println("C -"+s));;
		
	}

}
