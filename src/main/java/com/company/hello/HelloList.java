package com.company.hello;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class HelloList 
{
    public static void main( String[] args )
    {
    	ArrayList<Person> persons = Person.createPersons();
    	
    	for(PersonInterface person: persons) {
    		System.out.println(person);
    	}
    	
    	System.out.println("Iterator:");
    	Iterator<Person> persIterator = persons.iterator();
    	while(persIterator.hasNext()) {
    		PersonInterface p  =persIterator.next();
    		System.out.println(p);
    	}
    	
        System.out.println( "Hello World!" );
    }
}
