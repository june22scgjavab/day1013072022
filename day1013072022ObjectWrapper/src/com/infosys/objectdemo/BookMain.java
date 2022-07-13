package com.infosys.objectdemo;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1=new Book(1,"Sports",450);
		Book book2=new Book(1,"Sports",450);
        boolean b=book1.equals(book2);	
        System.out.println(b);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
	}

}
