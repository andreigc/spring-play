package com.company.hello;

public class MemoTester {

	
	public static void main(String[] args) throws Exception {
		PersonInterface mp = MemoisationPerson.createMemoPerson(new Person("Ana", 30));
		mp.printName();
		System.out.println(mp.computeTaxes(300));
		System.out.println(mp.computeTaxes(600));
		System.out.println(mp.computeTaxes(300));
	}
}
