package com.infosys.wrapperdemo;

public class WrapperDemo {

	public static void main(String[] args) {
		
		long l=20;
		int n=(int)l;
       // Long lObj=n;//Type mismatch: cannot convert from int to Long
      // In line 9 first int is converted to
	  // Integer and we tried assigning int to
	 // Long which means we are trying to
	// convert from Integer to Long
	// int to long is possible for primitive
	// type because size of int is less than long
	// But in case of reference type there is
	// no concept of size to decide casting
   // and conversion but here we check for
	// Parent child relationship and Long
	// and Integer dont have parent child 
	// relationship .. They are siblings.
		
		Long lObj=l; // Ya possible
		Integer phoneNo = 44281234; 
		Long phoneNo2 = phoneNo.longValue(); // Converts Integer into a Long value

	}

}
