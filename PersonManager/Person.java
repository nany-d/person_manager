package com.qa.people.manager;

import java.util.ArrayList;

public class Person {
	int id;
	String name;
	int age;
	String jobTitle;

	ArrayList<Cat> noOfCats = new ArrayList<>();
	ArrayList<Dog> noOfDogs = new ArrayList<>();

	public Person(int id, String name, int age, String jobTitle) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public void listCats() {
		for (int i = 0; i < noOfCats.size(); i++) {
			System.out.print("Cats:  ");
			System.out.println(noOfCats.get(i).name);
		}

	}

	public void listDogs() {
		for (int i = 0; i < noOfDogs.size(); i++) {
			System.out.print("Dogs:  ");
			System.out.println(noOfDogs.get(i).name);
		}
	}

	public void addCat(Cat cat) {
		noOfCats.add(cat);
	}

	public void addDog(Dog dog) {
		noOfDogs.add(dog);
	}

	public void rmCat() {
		for (int i = 0; i < noOfCats.size(); i++) {
			if (noOfCats.get(i).name == "Daisy") {
				noOfCats.remove(i);
			}
		}

	}

	public void rmDog() {
		for (int i = 0; i < noOfDogs.size(); i++) {
			if (noOfDogs.get(i).name == "Daisy") {
				noOfDogs.remove(i);
			}
		}

	}

	public Cat findCatByName(Cat cat) {
		for (int i = 0; i < noOfCats.size(); i++) {
			if (noOfCats.get(i).name == cat.name) {
				return cat;
			}
		}
		return null;
	}

	public Dog findDogByName(Dog dog) {
		for (int i = 0; i < noOfDogs.size(); i++) {
			if (noOfDogs.get(i).name == dog.name) {
				return dog;
			}
		}
		return null;
	}

}
