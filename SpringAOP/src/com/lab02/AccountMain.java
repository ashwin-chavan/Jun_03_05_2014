package com.lab02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab02/lab02.xml");
		Account account = context.getBean("account",Account.class);
		account.deposit(10000);
		account.withdraw(100);
		account.withdraw(100000);
		account.withdraw(11000);
	}

}
