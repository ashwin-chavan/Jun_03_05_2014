package com.ds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void deletePerson(int id){
		jdbcTemplate.update("delete from persons where id=?",id);
	}
	public void insertPerson(String name,int age){
		jdbcTemplate.update("insert into persons(name,age) values(?,?)",
				name,age);
	}
}
