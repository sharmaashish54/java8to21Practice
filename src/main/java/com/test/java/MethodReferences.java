package com.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {

	public static void main(String[] args) {
		printRefEx();	
		stringMethodRef();		
		stringMethodRefPred();	
		unBoundedReference();	
		staticMethodReference();
		constructorMethodReference();
		
	}

	private static void constructorMethodReference() {
		Supplier<StringBuilder> sup1 = ()-> new StringBuilder();
		StringBuilder sb = sup1.get();
		sb.append("Hi this is sb1");
		
		System.out.println(sb);
		
		Supplier<StringBuilder> sup2 = StringBuilder::new;//method reference
		StringBuilder sb2 = sup2.get().append("Hi this is sb2");
		System.out.println(sb2);
		
		
		Function<Integer, List<Integer>> fn1 = x -> new ArrayList(x);
		List<Integer> ls1 = fn1.apply(5);
		ls1.add(2);
		System.out.println(ls1);
		
		Function<Integer, List<Integer>> fn2 = ArrayList::new;//method reference
		List<Integer> ls2 = fn1.apply(2);
		ls2.add(42);
		System.out.println(ls2);
	}

	private static void staticMethodReference() {
		List<Integer> numberList = Arrays.asList(1,2,5,2,6,8);
		
		Consumer<List<Integer>> cn1 = list -> Collections.sort(list);
		cn1.accept(numberList);
		System.out.println(numberList);
		
		//numberList.add(100);
		
		Consumer<List<Integer>> cn2 = Collections::sort;
		cn2.accept(numberList);
		System.out.println(numberList);
	}

	private static void unBoundedReference() {
		Function<String, String> fn1 = s -> s.toUpperCase();
		System.out.println(fn1.apply("sharma"));
		Function<String, String> fn2 = String::toUpperCase;
		System.out.println(fn2.apply("ashish"));
		
		BiFunction<String,String,String> bifn1 = (s1,s2)-> s1.concat(s2);
		System.out.println(bifn1.apply("Sharma ", "Ashish"));
		BiFunction<String,String,String> bifn2 = String::concat;
		System.out.println(bifn2.apply("Ashish ", "Sharma"));
	}

	private static void stringMethodRefPred() {
		String name = "Mr. Ashish Sharma";
		Predicate<String> prd1 = (title) -> name.startsWith(title);
		System.out.println(prd1.test("Mr."));
		
		Predicate<String> prd2 = name::startsWith;
		System.out.println(prd2.test("Mr.."));
	}

	private static void stringMethodRef() {
		String str = "I Love Coding!!";
		Supplier<String> sp = () -> str.toLowerCase();
		System.out.println(sp.get());
		
		Supplier<String> sp2 = str::toLowerCase;//method reference
		System.out.println(sp2.get());
	}

	private static void printRefEx() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			list.add(i);
		}
		list.forEach(System.out::println);
	}

}
