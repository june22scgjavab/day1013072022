package com.infosys.wrapperdemo;

public class IntegerWrapperDemo2 {

	public static void main(String[] args) {
	    String num1=" 100 ";// java.lang.NumberFormatException:
		 num1=num1.trim();
	    //String num1="100";
		String num2="200";
		System.out.println(num1+num2);
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		System.out.println(n1+n2);
	}

}
