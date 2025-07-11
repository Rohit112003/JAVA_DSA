package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StingHelperParametrizedTest {
	
	 StringHelper helper;

	    @BeforeEach
	    public void setUp() {
	        helper = new StringHelper();
	    }

	    // 🔹 Parameterized test for truncateAInFirst2Positions
	    @ParameterizedTest
	    @CsvSource({
	        "AACD, CD",
	        "ACD, CD",
	        "CDAA, CDAA",
	        "AA, ''",
	        "'', ''"
	    })
	    void testTruncateAInFirst2Positions(String input, String expected) {
	        assertEquals(expected, helper.truncateAInFirst2Positions(input));
	    }

	    // 🔹 Parameterized test for areFirstAndLastTwoCharactersTheSame
	    @ParameterizedTest
	    @CsvSource({
	        "ABCD, false",
	        "ABAB, true",
	        "AB, true",
	        "A, false",
	        "'', false"
	    })
	    void testAreFirstAndLastTwoCharactersTheSame(String input, boolean expected) {
	        assertEquals(expected, helper.areFirstAndLastTwoCharactersTheSame(input));
	    }
	}