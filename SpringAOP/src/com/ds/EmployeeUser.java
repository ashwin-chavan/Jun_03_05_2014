package com.ds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeUser {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp.getClass());
		System.out.println(emp.getClass().getSuperclass());
		emp.setId("sam456");
		emp.work();
	}
}







