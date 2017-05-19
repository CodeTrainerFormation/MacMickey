package com.ib.macmickey.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ib.macmickey.dao.CommandDAO;

public class TestCommandDao {

	private CommandDAO dao;
	
	@Before
	public void setUp() throws Exception {
		this.dao = new CommandDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCommands() {
		assertNotNull(this.dao.getCommands()); 
	}

}
