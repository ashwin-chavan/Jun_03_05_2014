package com.ds;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void work(){
		System.out.println("I am on Facebook");
	}
}
