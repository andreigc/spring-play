package com.company.spring.jdbc;

import java.util.List;

import com.company.spring.xml.Customer;

public interface CustomerDAO {
	
	void insert(Customer customer);
	
	Customer findByCustomerId(int customerid);

	List<Customer> findByCustomeName(String customerName);
}
