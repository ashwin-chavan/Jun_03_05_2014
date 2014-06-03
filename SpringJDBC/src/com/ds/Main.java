package com.ds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bin/beans.xml");
		PersonsDao personsDao = context.getBean("personsDao",PersonsDao.class);
		DogsDao dogsDao = context.getBean("dogsDao",DogsDao.class);
		dogsDao.addDog("Jimmy", "Dobberman");
		//personsDao.insertPerson("Sam", 24);
		System.out.println("Success");
	}

}
