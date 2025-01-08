package com.test.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExcercise2 {

	public static void main(String[] args) {
		
		List<Person> listPeople = getPeople();
		sortAge(listPeople);
		sortName(listPeople);
		sortHeight(listPeople);
	
	}

	private static void sortAge(List<Person> listPeople) {
		listPeople.sort(Comparator.comparing(Person::getAge));
		listPeople.forEach(person -> System.out.println("By Age: "+person));
	}
	
	private static void sortName(List<Person> listPeople) {
		listPeople.sort(Comparator.comparing(Person::getName));
		listPeople.forEach(person -> System.out.println("By Name: "+person));
	}
	
	private static void sortHeight(List<Person> listPeople) {
		listPeople.sort(Comparator.comparing(Person::getHeight));
		listPeople.forEach(person -> System.out.println("By Height: "+person));
	}
	
	
	private static List<Person> getPeople() {
		List<Person> result = new ArrayList<>();
		result.add(new Person("Mike", 33, 1.8));
		result.add(new Person("Mary", 25, 1.4));
		result.add(new Person("Alan", 34, 1.7));
		result.add(new Person("Zoe", 30, 1.5));
		return result;
		}

}
