package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysCompareTest {
	
	//Arrays.sort

	@Test
	void testArraySort_RandomArray() {
		int [] numbers = {12,4,3,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	
	@Test
	void testArraySort_Random_NullArray() {
	    assertThrows(NullPointerException.class, () -> {
	        int[] numbers = null;
	        Arrays.sort(numbers);
	    });
	}
	
	
	@Test
	void testSortPerformance() {
	    assertTimeout(Duration.ofMillis(100), () -> {
	        int[] array = {12, 3, 4};
	        for (int i = 1; i <= 1000000; i++) {
	            array[1] = i;
	            Arrays.sort(array);
	        }
	    });}

}
