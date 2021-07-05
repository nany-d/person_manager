package com.qa.people.manager;

public class App {

	public static void main(String[] args) {

		PersonManager personManager = new PersonManager();

		Person danny = new Person(1, "Danny", 22, "Software Engineer");
		Person daisy = new Person(2, "Daisy", 22, "Software Engineer");
		Person dave = new Person(3, "Dave", 22, "Software Engineer");

		personManager.addPerson(danny);
		personManager.addPerson(daisy);
		personManager.addPerson(dave);

		personManager.listPerson();
		personManager.rmPerson(daisy);

		Cat blinx = new Cat(1, "Blinx", 5, "Orange");

		personManager.findPersonByName(danny).addCat(blinx);
		personManager.findPersonByName(danny).listCats();

		personManager.findPersonByName(danny).findCatByName(blinx).speak();

		Dog bowow = new Dog(1, "Bowow", 5, "Black");

		personManager.findPersonByName(danny).addDog(bowow);
		personManager.findPersonByName(danny).listDogs();

		personManager.findPersonByName(danny).findDogByName(bowow).speak();
	}

}
