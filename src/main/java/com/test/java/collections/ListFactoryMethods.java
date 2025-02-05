package com.test.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListFactoryMethods {

	public static void main(String[] args) {
		
		//List interface is implemented by ArrayList, Stack, LinkedList

		String[] array = new String[] {"Ashish","Shefali","Mysha","Kiara"};
		
		List<String> asList = Arrays.asList(array);
		List<String> ofList = List.of(array);
		List<String> copyList = List.copyOf(ofList);

		array[0] = "Ashish Sharma";
		System.out.println(Arrays.toString(array));
		System.out.println(asList);
		
		asList.set(1,"Shefali Sharma");
		System.out.println(Arrays.toString(array));
		System.out.println(asList);
		System.out.println(copyList);
		//ofList.add("Sharma");//unsupoortedoperationException
		
		
		//ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Ashish");
		arrayList.add("Shefali");
		arrayList.add("Mysha");
		arrayList.add("Kiara");
		System.out.println(arrayList);
		arrayList.replaceAll(s->s+" Sharma");
		System.out.println(arrayList);
		
		//Stack- LIFO
		Stack<String> stack = new Stack<>();
		
		stack.push("Ashish");
		stack.push("Shefali");
		stack.push("Mysha");
		stack.push("Kiara");
		
		System.out.println("Stack LIFO"+stack);
		
		System.out.println(stack.peek());//looks at the top of stack
		System.out.println(stack);
		System.out.println(stack.pop());//removes the top element of stack
		System.out.println(stack);
		stack.push("Sharma");//push at the top of stack
		System.out.println(stack);
		
		//Linked List

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Ashish");
		linkedList.add("Shefali");
		linkedList.add("Mysha");
		linkedList.add("Kiara");
		System.out.println("linkedList "+linkedList);
		linkedList.removeIf(s->s.startsWith("K"));
		System.out.println(linkedList);
		
		linkedList.add("Sharma");
		
		
		linkedList.remove(1);
		
		System.out.println(linkedList);
		
		linkedList.addFirst("Kiara");
		linkedList.addLast("Shefali");
		System.out.println(linkedList);
		linkedList.stream().sorted().forEach(System.out::print);
	}

}
