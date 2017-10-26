package com.company.hello;

import java.util.Deque;
import java.util.LinkedList;

public class HelloQueue {
	
	public static void main(String[] args) {
		
		Deque<Person> personsBuyingStuff = new LinkedList<Person>();
		
		personsBuyingStuff.push(new Person("Second", 2));
		personsBuyingStuff.push(new Person("First", 1));
		
		System.out.println(personsBuyingStuff.pop());
		System.out.println(personsBuyingStuff.pop());
		
		
		//List<Person> personsBuyingStuff = Person.createPersons();
		
		//Deque<Person> persons = Person.createPersonsQueue();
		
		//persons.
		
	}

}
