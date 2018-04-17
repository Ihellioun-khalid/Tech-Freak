 package com.string;

public class Demo {
	
	public boolean compareStringIgnoreCase(String first,String second) {
		if(first.equalsIgnoreCase(second)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String concatString(String first,String second) {
		return first.concat(second);	
	}
	public int [] addOneToArray(int [] numbers) {
		int length = numbers.length;
		int output [] =new int [length];
		for(int i=0;i<length;i++) {
			output[i]=numbers[i ]+1;
		}
		return output;
	}
	public void performance() {
		for (int i = 0; i < 1000000; i++) {
			
		}
		System.out.println("=====Finish====");
	}
}
