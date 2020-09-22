package com.spring.ex;

public class Person {
private String id;
private String pw;
private String name;
private String addr;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
	System.out.println("setId()");
}
public String getPw() {
	System.out.println("setPw()");
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public Person(String id, String pw, String name, String addr) {
	super();
	System.out.println("Person(String id, String pw, String name, String addr)");
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.addr = addr;
}
public Person() {
System.out.println("Person()");
}
	
}

