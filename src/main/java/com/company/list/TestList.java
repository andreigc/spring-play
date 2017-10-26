package com.company.list;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.company.hello.Person;

public class TestList {
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> lf = ListFill.createFillList(al, 999);
		//lf.add(0, 324);
		System.out.println(lf.get(0));
		System.out.println(lf.get(5));
		System.out.println(lf);
		lf.add(5679);
		lf.add(9,55);
		System.out.println(lf);
		
		
		List<String> strList = new ArrayList<>();
		List<String> strListFill = ListFill.createFillList(strList, "dummy");
		//lf.add(0, 324);
		System.out.println(strListFill.get(0));
		System.out.println(strListFill.get(4));
		strListFill.add("StrNou");
		strListFill.add(9,"AltStr");
		System.out.println(strListFill);
		
		Person ion = new Person("Ion", 21);
		Person vasile  = new Person("Vasile", 31);
		List<Person> personList = new ArrayList<Person>();
		List<Person> personListFill = ListFill.createFillList(personList, ion);
		personListFill.add(3, vasile);
		System.out.println(personListFill);
		
	}

}
