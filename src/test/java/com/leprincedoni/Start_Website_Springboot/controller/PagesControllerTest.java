package com.leprincedoni.Start_Website_Springboot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@WebMvcTest(PagesController.class)
public class PagesControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void home() throws Exception {
		
		this.mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Hello World!"));
	
	}

}
