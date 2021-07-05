package com.qa.people.manager;

public class Dog {
	int id;
	String name;
	int age;
	String colour;

	public Dog(int id, String name, int age, String colour) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.print("Dog says:  ");
		System.out.println("Wooof");
	}

}
