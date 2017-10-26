package com.company.patterns.singleton;

import com.company.hello.PersonInterface;
import com.company.hello.Person;

public class PersonsFactory {
	
	private static PersonsFactory instance = new PersonsFactory();
	
	private PersonsFactory() {
		
	}
	
	public static PersonsFactory getInstance() {
		return instance;
	}
	
	public PersonInterface createPerson(String name, int age) {
		
		PersonInterface person = new Person(name, age);
		validateHr(person);
		return person;
	}

	private void validateHr(PersonInterface person) {
		System.out.println(String.format("Validating: %s", person.getName()));
	}

}
