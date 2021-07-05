package com.qa.people.manager;

public class Cat {
	int id;
	String name;
	int age;
	String colour;

	public Cat(int id, String name, int age, String colour) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.print("Cat says:  ");
		System.out.println("MEOWwwww");
	}

}
