package com.company.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloMap {
	
	public static void main(String args[]) {
		Map<Integer, Integer> numberOfPersonsByAge = new HashMap<Integer, Integer>();
		
		List<Person> persons = Person.createPersonsQueue();
		for(PersonInterface p: persons) {
			int currentAge = p.getAge();
			Integer currentNumber = numberOfPersonsByAge.get(currentAge);
			if(currentNumber == null) {
				numberOfPersonsByAge.put(currentAge, 1);
			} else {
				numberOfPersonsByAge.put(currentAge, currentNumber += 1);
			}
		}
		
		System.out.println(numberOfPersonsByAge);
		
//		persons.stream().reduce(new HashMap<Integer, Integer>(), p -> {
			
//		});
		
		
	}

}
