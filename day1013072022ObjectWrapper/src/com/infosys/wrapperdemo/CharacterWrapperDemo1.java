package com.infosys.wrapperdemo;

public class CharacterWrapperDemo1 {

	public static void main(String[] args) {
	Character ch1='A';  //"A"
	Character ch2='1';
	
	System.out.println(Character.isAlphabetic(ch1));
	System.out.println(Character.isDigit(ch2));
	System.out.println(Character.isAlphabetic(ch2));
	System.out.println(Character.isDigit(ch1));
	System.out.println(Character.isUpperCase(ch1));
	 String str1=ch1.toString();
	 System.out.println(str1);
	
	}

}
