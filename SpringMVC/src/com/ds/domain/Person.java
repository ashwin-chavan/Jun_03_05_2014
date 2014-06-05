package com.ds.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "ENTER YOUR NAME";
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
