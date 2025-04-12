package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
private int custid;
private String custname;
private String coursename;
@Autowired
private Technologies techdetail;
public Technologies getTechdetail() {
	return techdetail;
}
public void setTechdetail(Technologies techdetail) {
	this.techdetail = techdetail;
}
//47.21
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public void display() {
	System.out.println("Object returned Successfully");
	techdetail.tech();
	//class A is dependent on class B
	//class b not aware
	//Auto wire-to enable a class to recognize the other class
	//@Autowoire
}
}
