package com.infosys.wrapperdemo;

public class CharacterWrapperDemo2 {

	public static void main(String[] args) {
		Character ch1='A';
		Character ch2='D';
		Character ch3='A';
		
		int val=ch1.compareTo(ch2);
		System.out.println(val);// -1
		val=ch2.compareTo(ch1);
		System.out.println(val);//1
		val=ch1.compareTo(ch3);
		System.out.println(val);//0
		
		char ch4='A';
		char ch5='a';
		val=Character.compare(ch5,ch4);
		System.out.println(val);
		
				

	}

}
