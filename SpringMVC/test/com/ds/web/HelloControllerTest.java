package com.ds.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/aci-servlet.xml"})
@WebAppConfiguration
public class HelloControllerTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test() {
		assertNotNull(webApplicationContext);
		assertNotNull(mockMvc);
	}
	@Test
	public void testHello()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/hello?name=Sam")).
			andExpect(MockMvcResultMatchers.status().isOk()).
			andExpect(MockMvcResultMatchers.content().string("Hello Sam"));
	}
	@Test
	public void testAdd()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/add?a=12&b=13")).
		andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testAddResult()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/add?a=12&b=13")).
		andExpect(MockMvcResultMatchers.status().isOk()).
		andExpect(MockMvcResultMatchers.content().string("25"));
	}
	@Test
	public void testAddInvalidQuery()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/add?n1=12&n2=13")).
		andExpect(MockMvcResultMatchers.status().is(400));
	}

}
