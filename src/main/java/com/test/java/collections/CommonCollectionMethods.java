package com.test.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CommonCollectionMethods {

	public static void main(String[] args) {
		
		Collection<String> col1 = new ArrayList<>();//List Allows duplicates
		
		col1.add("Ashish");
		col1.add("Kiara");
		col1.add("Shefali");
		col1.add("Mysha");
		
		System.out.println(col1);
		System.out.println(col1.remove("Kiara"));
		System.out.println(col1.isEmpty());
		System.out.println(col1);
		System.out.println(col1.contains("Ashish"));
		System.out.println(col1.removeIf(s->s.startsWith("M")));
		col1.forEach(System.out::print);
		col1.clear();
		col1.forEach(System.out::println);//doesn't print anything

	}

}
