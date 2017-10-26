package com.company.spring.annotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.spring.jdbc.CustomerDAO;
import com.company.spring.xml.Customer;

public class AnnotationApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		
	//	System.out.println(context.getBean("a1"));
	//	System.out.println(context.getBean("c1"));
		
//		Customer c1 = context.getBean("c1", Customer.class);
		
	//	System.out.println(context.getBean("person"));
		
//		CustomerDAO customerDao = context.getBean("customerDAO", CustomerDAO.class);
		//customerDao.insert(c1);
//		System.out.println(customerDao.findByCustomerId(11));
//		System.out.println(customerDao.findByCustomeName("first"));
		
		Person gigi = new Person("Gigi", 23);
		
		EntityManagerFactory emf = context.getBean("emf", EntityManagerFactory.class);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(gigi);
		em.getTransaction().commit();
		
		System.out.println(gigi);
		
	}
	

}
