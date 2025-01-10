package com.test.java.streams;

public class Cat {

	private String name, color;
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + "]";
	}

	public Cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
}
