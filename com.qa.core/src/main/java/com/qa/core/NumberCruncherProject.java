package com.qa.core;

public class NumberCruncherProject {

	
	public int findTheBigNumber(int[] input) throws MyException {
		
		
		//if(input.length < 0) {
			//throw new MyExeception("Array length needs to be greater than 0");
		//}
		
		
		for (int i = 0; i < input.length; i++) {
			
			if(input.length<1) {
				throw new MyException("Array must contain something");
			}
			
			if(input.length == 1) {
				return input[0];
			}else if(input[0]<input[1]){
				return input[1];
			}else {
				return input[0];
			}
			
		}return 0;
		
		
		
		
		}
		
		
	}
	
	

