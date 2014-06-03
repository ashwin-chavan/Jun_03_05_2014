package com.ds;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Person> getAllPersons(){
		List<Person> persons = null;
		persons = jdbcTemplate.query("select * from persons", 
						new RowMapper<Person>(){
							public Person mapRow(ResultSet rs, int rowIndex)
									throws SQLException {
								Person p = new Person(rs.getInt("id"),
														rs.getString("name"),
														rs.getInt("age"));
								return p;
							}
			
						}
		);
		return persons;
	}
	public int getAge(int id){
		int age = jdbcTemplate.queryForObject("select age from persons "
												+ "where id=?",
												new Object[]{new Integer(id)},
												Integer.class);
		return age;
	}
	public List<String> getAllNames(){
		List<String> names = null;
		names = jdbcTemplate.queryForList("select name from persons", 
					String.class);
		return names;
	}
	
	public void deletePerson(int id){
		jdbcTemplate.update("delete from persons where id=?",id);
	}
	public void insertPerson(String name,int age){
		jdbcTemplate.update("insert into persons(name,age) values(?,?)",
				name,age);
	}
}
