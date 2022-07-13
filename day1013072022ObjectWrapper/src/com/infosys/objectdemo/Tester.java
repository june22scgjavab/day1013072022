package com.infosys.objectdemo;

public class Tester {

	public static void main(String[] args) {
	Computer computer1=new Computer(1,"HP",16,1);
	Computer computer2=new Computer(1,"HP",16,1);
	Computer computer3=new Computer(2,"Dell",8,1);
	Computer computer4=computer3;
	System.out.println(computer1==computer2); // false
	System.out.println(computer2==computer3); // false
	System.out.println(computer4==computer3);  //true
	System.out.println(computer1.equals(computer2)); // true
	System.out.println(computer1.equals(computer3)); // false
	System.out.println(computer1.hashCode());
	System.out.println(computer2.hashCode());
	System.out.println(computer3.hashCode());
	System.out.println(computer4.hashCode());
	System.out.println(computer1);
	//System.out.println(computer1.toString());
	}

}
