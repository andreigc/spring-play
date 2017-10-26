package com.company.spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.company.spring.xml.Address;
import com.company.spring.xml.City;
import com.company.spring.xml.Country;
import com.company.spring.xml.Customer;

@Configuration
@EnableScheduling
public class Customers {
	
	@Scheduled(fixedDelay = 5000)
	public void SayHello() {
		System.out.println("Hello");
	}

	@Bean(name = { "RO" })
	public Country ro() {
		return new Country(5, "Romania");
	}
	
	
	@Bean(name = {"buch"})
	public City buch(@Qualifier("RO") Country c) {
		return new City(1, "Bucharest", c);
	}
	
	@Bean(name = "a1")
	public Address a1(@Qualifier("buch") City c) {
		Address a = new Address();
		a.setId(1);
		a.setAddress("adresa");
		a.setCity(c);
		return a;
	} 
	
	@Bean(name = "c1")
	public Customer c1(@Qualifier("a1") Address a) {
		Customer c = new Customer(1, "first", "last", "a@b.c", a, true);
		return c;
	}
	
	
}
