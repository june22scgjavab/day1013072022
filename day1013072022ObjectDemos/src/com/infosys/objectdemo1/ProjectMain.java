package com.infosys.objectdemo1;

public class ProjectMain {

	public static void main(String[] args) {
		Project project1=new Project(111,"Banking","Java");
		Project project2=new Project(111,"Banking","Java");
		System.out.println(project1==project2); // == it checks whether the reference variable project1 and project2 are refering to the
		// same object or not //false
		System.out.println(project1.equals(project2)); //false
		// Our expectation is it should return true as the contents
		// of both the objects are same and equals will check
		// for the equality with the value/values.
		System.out.println(project1.hashCode());
		System.out.println(project2.hashCode());

	}

}
