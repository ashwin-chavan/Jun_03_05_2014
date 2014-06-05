package com.ds.web;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/aci-servlet.xml",
						"file:WebContent/WEB-INF/applicationContext.xml"})
@WebAppConfiguration
public class HelloControllerTest2 {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;

	@Test
	public void testDummy()throws Exception{
		mockMvc.perform(get("/dummy")).
			andExpect(view().name("cool")).
			andExpect(forwardedUrl("/WEB-INF/acipages/cool.jsp")).
			andExpect(status().is(200));
	}
	@Test
	public void testHttpContent()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/hello?name=Sam")).
				andExpect(MockMvcResultMatchers.status().isOk()).
				andExpect(MockMvcResultMatchers.content().string("Hello Sam"));
	}
	@Test
	public void testHttpStatus200()throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")).
				andExpect(MockMvcResultMatchers.status().is(200));
	}
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.
					webAppContextSetup(webApplicationContext).
					build();
	}
	
	@Test
	public void testSetup(){
		assertNotNull(webApplicationContext);
		assertNotNull(mockMvc);
	}

	@After
	public void tearDown() throws Exception {
	}

}
