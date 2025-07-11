package com.in28minutes.junit.helper;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ StingHelperParametrizedTest.class, StingHelperTest.class })
public class AllTests {

}
