package org.springframework.samples.mvc.midi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.samples.mvc.AbstractContextControllerTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
public class MidiMappingControllerTests extends AbstractContextControllerTests {

	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
	}
	
	@Test
	public void produceZoneJson() throws Exception {
		this.mockMvc.perform(get("/midi/zoneJson.json"))
		.andExpect(jsonPath("name").value("A"))
		.andExpect(jsonPath("description").value("Regular zone"));
	}
	@Test
	public void produceZoneXml() throws Exception {
		this.mockMvc.perform(get("/midi/zoneXml.xml"))
		.andExpect(xpath("/zone/name").string("A"))
		.andExpect(xpath("/zone/description").string("Regular zone"));
	}
	
}
