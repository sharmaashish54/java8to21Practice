package com.test.java;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

interface Evaluate<T> {
	boolean isNegative(T t);
}

public class TestFIFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TestFIFunctions testfif = new TestFIFunctions();
		testfif.predicate();
		testfif.supplier();
		testfif.consumer();
		testfif.function();
		testfif.unaryBinary();
		
		//Concept of effective final for local variable
		int x = 10;
		
		System.out.println(x);
		
		Predicate<String> prd = s -> {
			//if(s.isEmpty() && x>0) {
			//x++; // cannot change the value of local variable since it is effective final
				System.out.println(x+" "+s);
				return s.isEmpty() && x>0;
				//} 
			};
			//x++;
		prd.test("Effective Final "+x);	

	}

	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
	}
	
	public void predicate() {
		//predicate has test method, returns boolean
		System.out.println(check(4, n -> n % 2 == 0));
		System.out.println(check(7, x -> x < 0));
		System.out.println(check("Ashish", s -> s.startsWith("A")));// Data type changed to string

		Predicate<Integer> predicate = (i -> i < 0);
		System.out.println(predicate.test(-1));

		Evaluate<Integer> lambda = n -> {
			return n < 0;
		};
		System.out.println(lambda.isNegative(-1));
		System.out.println(lambda.isNegative(1));

		BiPredicate<String, Integer> bypredicate = ((str, len) -> str.length() == len);
		System.out.println(bypredicate.test("Ashish", 6));
	}

	public void supplier() {
		//supplier has get method, returns same type which is passed
		Supplier<StringBuilder> sb = () -> new StringBuilder();
		System.out.println(sb.get().append("Supplier has").append(" get() function."));

		Supplier<LocalTime> dt = () -> LocalTime.now();
		// DateTimeFormatter dtf = new DateTimeFormatter("DDMMYY");
		System.out.println(dt.get());

		Supplier<Double> rdm = () -> Math.random();

		System.out.println(rdm.get() * 100);
	}

	public void consumer() {
		//Consumer has accept method, returns void
		Consumer<Integer> cm = s -> System.out.println(s);

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}

		list.forEach(cm);

		Map<String, Integer> mp = new HashMap<>();
		BiConsumer<String, Integer> bcsm = ((k, v) -> mp.put(k, v));

		bcsm.accept("Ashish", 1);
		bcsm.accept("Sharma", 2);

		mp.entrySet().stream().forEach(k -> System.out.println(k.getKey() + " " + k.getValue()));

		// Another way to print key value pairs or iterating through each element.
		BiConsumer<String, Integer> printmp = (k, v) -> System.out.println(k + "=" + v);
		mp.forEach(printmp);
	}
	
	public void function() {
		//Function has apply method, take one type returns same/another tyoe
		Function<String,Integer> func = s -> s.length();
		System.out.println(func.apply("Ashish"));
		
		BiFunction<String,String,Integer> bif = (s1,s2) -> s1.length()+s2.length();
		System.out.println(bif.apply("Ashish", "Sharma"));
		
		BiFunction<String,String,String> bif2 = (s1,s2) -> s1.concat(s2);
		System.out.println(bif2.apply("Shefali ", "Sharma"));
		
		
		
	}
	
	public void unaryBinary() {
		//Unary and binary operator has apply function
		UnaryOperator<String> uop = s->"name is "+s;
		System.out.println(uop.apply("Ashish"));
		
		BinaryOperator<String> bop = ((s1,s2) -> s1.concat(s2));
		System.out.println(bop.apply("Mysha ", "Sharma"));
		
		
	}

}
