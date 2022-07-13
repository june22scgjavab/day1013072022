package com.infosys.objectdemo;

public class Book {
private int id;
private String title;
private float price;

public Book(int id, String title, int price) {
	this.id=id;
	this.title=title;
	this.price=price;
}

public boolean equals(Object object)
{
	Book temp=(Book)object;
if(this.id==temp.id && this.title.equals(temp.title) && this.price==price) {
	return true;
}
	return false;
}

}
