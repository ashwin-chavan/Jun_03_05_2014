package com.lab06;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TopicDao {
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = null;
		topics = jdbcTemplate.query("select * from topics", new RowMapper<Topic>(){
			public Topic mapRow(ResultSet rs, int index) throws SQLException {
				Topic topic = new Topic();
				topic.setTitle(rs.getString("title"));
				topic.setId(rs.getInt("id"));
				topic.setDuration(rs.getInt("duration"));
				return topic;
			}
		});
		return topics;
	}
	
	public int insertTopic(String title,int duration){
		String query = "insert into topics(title,duration) values(?,?)";
		return jdbcTemplate.update(query,title,duration);
	}
	
	public Topic loadTopic(int id) {
		Map<String, Object> map = jdbcTemplate.queryForMap("Select * from topics where id=?",id);
		Topic topic = new Topic();
		topic.setId((Integer)map.get("id"));
		topic.setTitle(map.get("title").toString());
		topic.setDuration((Integer)map.get("duration"));
		return topic;
	}

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
