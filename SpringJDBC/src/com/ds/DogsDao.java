package com.ds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DogsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void addDog(String name,String breed){
		jdbcTemplate.update("insert into dogs(name,breed) values(?,?)",name,breed);
	}
}
