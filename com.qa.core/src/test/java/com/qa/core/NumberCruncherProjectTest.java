package com.qa.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberCruncherProjectTest {

	@Test
	void find_highest_number_in_array_of_one() {
		int input[] = {3};
		int expResult = 3;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}
	
	@Test
	void find_highest_number_in_array_of_two() {
		int input[] = {4 , 2};
		int expResult = 4;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}
	
	@Test
	void find_highest_number_in_array_of_two_mixed() {
		int input[] = {7 , 13};
		int expResult = 13;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}

}
