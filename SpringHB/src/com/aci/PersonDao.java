package com.aci;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	
	public void insert(String name,int age){
		Person person = new Person(name, age);
		hibernateTemplate.save(person);
	}
	public void deletePerson(int id){
		Person p = hibernateTemplate.load(Person.class, id);
		hibernateTemplate.delete(p);
	}
	public List<Person> getAllPersons(){
		return hibernateTemplate.find("from Person");
	}
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
