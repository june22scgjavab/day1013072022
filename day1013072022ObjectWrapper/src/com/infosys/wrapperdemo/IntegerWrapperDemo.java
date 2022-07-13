package com.infosys.wrapperdemo;

public class IntegerWrapperDemo {

	public static void main(String[] args) {
	Integer intObj=new Integer(20);  // Deprecated constructor
	int num0=intObj.intValue();
	System.out.println(intObj);
	int num=20;
	Integer intObj2=new Integer(num);
	System.out.println(intObj2);
	Integer intObj3=new Integer("100");
	System.out.println(intObj3);
	Integer intObj4=10; // auto-boxing==> primitive type to object  
	
	System.out.println(++intObj4);
	int num2=intObj2; // unboxing===> object to primitive type
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	}
	

}
