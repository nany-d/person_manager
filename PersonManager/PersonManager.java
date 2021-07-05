package com.qa.people.manager;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		people.add(person);
	}

	public void listPerson() {
		for (int i = 0; i < people.size(); i++) {
			System.out.print(people.get(i).id);
			System.out.print("  ");
			System.out.print(people.get(i).name);
			System.out.print("  ");
			System.out.print(people.get(i).age);
			System.out.print("  ");
			System.out.print(people.get(i).jobTitle);
			System.out.println("  ");
		}
	}

	public void rmPerson(Person person) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).name == person.name) {
				people.remove(i);
			}
		}
	}

	public Person findPersonByName(Person person) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).name == person.name) {
				return person;
			}
		}
		return null;
	}

}
