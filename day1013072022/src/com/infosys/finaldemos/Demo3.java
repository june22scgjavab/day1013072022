package com.infosys.finaldemos;

public class Demo3 {
	
	private final int NUM;  // If the final variable is instance variable it should be initialised at the place of declaration 
	                         // or with the constructor
	
	public Demo3() {
		NUM=30;   
	}
	
	
	public void display() {
		System.out.println(NUM);
	}

}
