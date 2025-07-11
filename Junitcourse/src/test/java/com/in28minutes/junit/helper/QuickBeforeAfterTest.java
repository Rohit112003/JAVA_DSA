package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

class QuickBeforeAfterTest {
	
	@BeforeClass
	public void beforeSetup() {
		System.out.println("Before classs");
	}

	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@After
	public void tearDown() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void AfterSetup() {
		System.out.println("After class");
	}
	

}
