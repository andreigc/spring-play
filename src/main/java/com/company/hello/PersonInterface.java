package com.company.hello;

public interface PersonInterface {

	String getName();

	int getAge();

	void printName();

	void printName(String prefix);
	
	float computeTaxes(int amount) throws Exception;

}