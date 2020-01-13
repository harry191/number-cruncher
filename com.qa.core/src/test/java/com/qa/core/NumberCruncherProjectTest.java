package com.qa.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberCruncherProjectTest {

	@Test
	void find_highest_number_in_array_of_one() throws MyException {
		int input[] = {3};
		int expResult = 3;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}
	
	@Test
	void find_highest_number_in_array_of_two() throws MyException {
		int input[] = {4 , 2};
		int expResult = 4;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}
	
	@Test
	void find_highest_number_in_array_of_two_mixed() throws MyException {
		int input[] = {7 , 13};
		int expResult = 13;
		NumberCruncherProject nc = new NumberCruncherProject();
		int result = nc.findTheBigNumber(input);
		
		assertEquals(expResult, result);
	}
	
	@Test
	void find_highest_number_in_array_of_none() {
		int input[] = {};
		NumberCruncherProject nc = new NumberCruncherProject();
		
		assertThrows(MyException.class,
				() -> nc.findTheBigNumber(input) );
	
	}

}
