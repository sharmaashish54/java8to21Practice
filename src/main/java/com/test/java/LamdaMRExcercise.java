package com.test.java;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Retrievable<T>{
	int retreive();
}

interface Printable<T>{
	void print();
}

public class LamdaMRExcercise {

	public static void main(String[] args) {
		LamdaMRExcercise lmr = new LamdaMRExcercise();
		lmr.consumer();
		lmr.Supplier();
		lmr.predicate();
		lmr.function();		

	}
	
	public void consumer() {
		
		Printable<String> printable = System.out::println;
		printable.print();
		
		Consumer<String> cn1 = s -> System.out.println(s);
		cn1.accept("Printable lambda");
		
		Consumer<String> cn2 = System.out::println;
		cn2.accept("Printable lambda");
	}
	
	public void Supplier() {
		
		Retrievable<Integer> retreive = () -> 77;
		System.out.println(retreive.retreive());
		
		Supplier<Integer> sup1= () -> 77;
		System.out.println(sup1.get());
	}
	
	public void predicate() {
		Predicate<Integer> prd1 = i -> i<0;
		prd1.test(+1);
		prd1.test(-1);
		
		System.out.println(check(4, i -> i%2==0));
		System.out.println(check(7, i -> i%2==0));
		System.out.println(check("Mr. Joe Bloggs", s -> s.startsWith("Mr.")));
		System.out.println(check("Ms. Ann Bloggs", s -> s.startsWith("Mr.")));
		System.out.println(check(33, i -> i>=18));
		System.out.println(check(31, i -> i>=18));
	}
	
	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
	}
	
	 public void function() {
		 String str = "Number is: ";
		 Function<Integer,String> fn1 = i -> str+i;
		 fn1.apply(25);
	 }

}
