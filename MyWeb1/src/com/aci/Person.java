package com.aci;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class Person {
	@Length(max=40,min=2)
	private String name;
	@Range(max=70,min=5)
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
