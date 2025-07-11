package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StingHelperTest {

	StringHelper helper;
	
	@BeforeEach
	public void before() {
		helper = new StringHelper();
	}
	
	
	
	@Test
	void test1() {
//		fail("Not yet implemented");
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
//		fail("Not yet implemented");
		String actual = helper.truncateAInFirst2Positions("ACD");
		String expected = "CD";
		assertEquals(expected,actual);
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame() {
		//this check the value of this is false than overall it return true;
	assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_2() {
		//this check the value of this is true than overall it return true;
	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}


}
