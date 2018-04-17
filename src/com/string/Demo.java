 package com.string;

public class Demo {
	
	public boolean compareStringIgnoreCase(String first,String second) {
		if(first.equalsIgnoreCase(second)) {
			return true;
		}
		return false;	
	}
	public String concatString(String first,String second) {
		return first.concat(second);	
	}
}
