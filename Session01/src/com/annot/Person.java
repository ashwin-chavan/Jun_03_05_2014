package com.annot;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person1")
public class Person {

	@Value("Sam")
	private String name;
	
	@Resource(name="emailsList")
	private List<String> emails;
	
	public List<String> getEmails() {
		return emails;
	}

	public String getName() {
		return name;
	}
	@Autowired
	private Car car;
	
	public Person(){
		System.out.println("***Person created***");
	}
}
