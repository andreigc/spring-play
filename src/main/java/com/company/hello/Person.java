package com.company.hello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person implements PersonInterface {
	
	private final String name;
	private final int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this.name = "John Doe";
		this.age = 100;
	}
	
	/* (non-Javadoc)
	 * @see com.company.hello.IPerson#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.company.hello.IPerson#getAge()
	 */
	@Override
	public int getAge() {
		return age;
	}
	
	/* (non-Javadoc)
	 * @see com.company.hello.IPerson#printName()
	 */
	@Override
	public void printName() {
		System.out.println(this.name);
	}
	
	/* (non-Javadoc)
	 * @see com.company.hello.IPerson#printName(java.lang.String)
	 */
	@Override
	public void printName(String prefix) {
		System.out.println(String.format("%s %s",prefix, this.name));
	}
	
	public float computeTaxes(int amount) throws Exception{
		Thread.sleep(3000);
		return amount * 0.57f;
		
	}
	
	public String toString() {
		return new StringBuilder()
		.append(String.format("My name is %s\n", this.name))
		.append(String.format("My age is: %s\n", this.age))
		.toString();
	}

	static ArrayList<Person> createPersons() {
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Gigi",50));
		persons.add(new Person("John",60));
		return persons;
	}
	
	
	static List<Person> createPersonsQueue() {
		LinkedList<Person> persons = new LinkedList<Person>();
		
		persons.add(new Person("Gigi Q",50));
		persons.add(new Person("Gigi A",50));
		persons.add(new Person("Gigi B",50));
		persons.add(new Person("Gigi C",50));
		persons.add(new Person("John",60));
		return persons;
	}
	

}
