package com.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotUser {
	public static void main(String[] args) {
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(Person.class,Car.class);
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("bin/com/annot/beans.xml");
//		Person person = context.getBean("person",Person.class);
//		System.out.println(person.getName());
//		System.out.println(person.getEmails());
	}
}
