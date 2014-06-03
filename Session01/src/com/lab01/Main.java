package com.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bin/com/lab01/lab01.xml");
		Conference conf = context.getBean(Conference.class);
		System.out.println("45 min session count: " + conf.getNumberOf45MinSessions());
		System.out.println("60 min session count: " + conf.getNumberOf60MinSessions());
		System.out.println("50 min session count: " + conf.getNumberOf50MinSessions());
	}

}
