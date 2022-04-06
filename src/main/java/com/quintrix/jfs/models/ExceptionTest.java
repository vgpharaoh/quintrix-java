package com.quintrix.jfs.models;

public class ExceptionTest {
public static void main(String[] args){
	String str = "abc";
	long num =0;
	
	try {
		num = Long.parseLong(str);
	}
	
	catch(NumberFormatException e){
		System.out.println("couln't convert" + str);
		num = -1;
		
	}
	
	finally {
		
	}
}
}
