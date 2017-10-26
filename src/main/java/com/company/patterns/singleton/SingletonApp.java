package com.company.patterns.singleton;

import com.company.hello.PersonInterface;

public class SingletonApp {
	
	public static void main(String[] args) {
		PersonInterface p = PersonsFactory.getInstance().createPerson("Gigi", 13);
		
		System.out.println(p);
		
	}
	

}
