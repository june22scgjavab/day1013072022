package com.infosys.finaldemos;

public class Child extends Parent {
//  Cannot override the final method from 
//	 Parent
	 public void display() {
		 System.out.println("Hello");
	 }
}
