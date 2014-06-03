package com.ds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bin/beans.xml");
		PersonsDao personsDao = context.getBean("personsDao",PersonsDao.class);
		DogsDao dogsDao = context.getBean("dogsDao",DogsDao.class);
		try{
			personsDao.incrementAge(1);
		}
		catch(DataAccessException dex){
			System.out.println("Error: " + dex.getMessage());
			Throwable rootCause = dex.getCause();
			System.out.println("Root cause: " + rootCause);
		}
		
		
		System.out.println(personsDao.getAge(1));
		System.out.println(personsDao.getAllNames());
		//dogsDao.addDog("Jimmy", "Dobberman");
		//personsDao.insertPerson("Sam", 24);
		System.out.println("Success");
	}

}
