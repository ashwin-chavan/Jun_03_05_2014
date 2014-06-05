package com.ds;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:test/test-beans.xml"})
public class PersonsDaoTest {
	@Autowired
	private ApplicationContext applicationContext;
	private PersonsDao personsDao;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void testDeletePerson(){
		//personsDao.insertPerson("Ram", 25);
		jdbcTemplate.execute("insert into persons(name,age) values('Ram',25)");
		int id = jdbcTemplate.queryForObject("select id from persons where name='Ram'", Integer.class);
		personsDao.deletePerson(id);
		int numberOfPersons = jdbcTemplate.queryForObject("Select count(*) from persons where id=" + id, Integer.class); 
		assertEquals(numberOfPersons,0);
	}
	@Test
	public void testAddPerson(){
		personsDao.insertPerson("Ram", 25);
		String name = jdbcTemplate.queryForObject("select name from persons where age=25", String.class);
		assertEquals(name,"Ram");
	}
	@Test
	public void testSetUp(){
		assertNotNull(applicationContext);
		assertNotNull(personsDao);
	}
	@Before
	public void setUp() throws Exception {
		personsDao = applicationContext.getBean("personsDao",PersonsDao.class);
		jdbcTemplate.execute("delete from persons");
	}

	@After
	public void tearDown() throws Exception {
	}
}
