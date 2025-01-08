package com.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

interface Sortable<T> {
	void sort(List<Integer> list);
}

interface Check<T> {
	boolean check(String str);
}

interface CheckString<T> {
	boolean checkStr(String str);
}

public class MethodReferenceExcercise2 {

	public static void main(String[] args) {
		staticMR();
		boundMR();
		unboundMr();
		constructorMR();
	}

	public static void staticMR() {
		List<Integer> list = Arrays.asList(1, 2, 7, 4, 5);
		Collections.sort(list);

		Sortable<List<Integer>> cn1 = list1 -> Collections.sort(list1);
		cn1.sort(list);
		list.forEach(System.out::println);

		list = Arrays.asList(2, 4, 5, 1, 9, 6);
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);

		Consumer<List<Integer>> methodRef = Collections::sort;
		methodRef.accept(list);

	}

	public static void boundMR() {
		String name = "Mr. Joe Bloggs";
		Check<String> prd1 = s -> name.startsWith(s);
		System.out.println(prd1.check("Mr."));
		System.out.println(prd1.check("Ms."));

		Check<String> prd2 = name::startsWith;// Method Reference
		System.out.println(prd2.check("Mr."));
		System.out.println(prd2.check("Ms."));
	}

	public static void unboundMr() {
		CheckString<String> prd1 = s -> s.isEmpty();
		System.out.println(prd1.checkStr(""));
		System.out.println(prd1.checkStr("xyz"));

		CheckString<String> prd2 = String::isEmpty;// Method Reference
		System.out.println(prd2.checkStr(""));
		System.out.println(prd2.checkStr("xyz"));

		BiPredicate<String, String> biprd1 = (s1, s2) -> s1.startsWith(s2);
		biprd1.test("Mr. Joe Bloggs", "Mr.");
		biprd1.test("Mr. Joe Bloggs", "Ms.");

		BiPredicate<String, String> biprd2 = String::startsWith;
		biprd2.test("Mr. Joe Bloggs", "Mr.");
		biprd2.test("Mr. Joe Bloggs", "Ms.");

	}

	public static void constructorMR() {

		Supplier<List<String>> sup1 = () -> new ArrayList<>();
		List<String> listStr = sup1.get();
		listStr.add("Lambda");
		System.out.println(listStr);

		Supplier<List<String>> sup2 = ArrayList::new;
		List<String> listStr2 = sup1.get();
		listStr2.add("Method Reference");
		System.out.println(listStr2);

		Function<Integer, List<String>> fn1 = x -> new ArrayList<String>(x);
		List<String> list = fn1.apply(10);
		list.add("Lambda");
		System.out.println(list);

		Function<Integer, List<String>> fn2 = ArrayList::new;// Method Reference
		List<String> listMR = fn1.apply(20);
		listMR.add("Lambda");
		System.out.println(listMR);

	}

}
