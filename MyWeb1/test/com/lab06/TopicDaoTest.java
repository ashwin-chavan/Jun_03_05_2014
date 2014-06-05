package com.lab06;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/test-applicationContext.xml")
public class TopicDaoTest {
	private TopicDao topicDao;
	private ApplicationContext applicationContext;
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void setUp(){
		jdbcTemplate.update("delete from topics");
	}
	
	@Test
	public void testGetAllTopics(){
		jdbcTemplate.update("insert into topics(title,duration) values(?,?)","Test1",60);
		jdbcTemplate.update("insert into topics(title,duration) values(?,?)","Test2",50);
		
		List<Topic> topics = topicDao.getAllTopics();
		assertNotNull(topics);
		assertEquals(topics.size(),2);
		assertEquals(topics.get(0).getTitle(),"Test1");
	}
	
	@Test
	public void testLoadATopic(){
		jdbcTemplate.update("insert into topics(title,duration) values(?,?)","Test1",60);
		int id = jdbcTemplate.queryForObject("select max(id) from topics",Integer.class);
		Topic topic = topicDao.loadTopic(id);
		assertNotNull(topic);
		assertTrue("Test1".equals(topic.getTitle()));
		assertEquals(60, topic.getDuration());
	}
	
	@Test
	public void testInsertTopic(){
		
		int numberOfRowsModified = topicDao.insertTopic("Test1", 34);
		assertTrue(numberOfRowsModified == 1);
	}
	
	
	

	@Autowired
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}

	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	@Autowired
	@Qualifier("testJdbcTemplate")
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Test
	public void testSetup() {
		assertNotNull(topicDao);
	}

}
