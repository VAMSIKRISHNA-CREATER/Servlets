package com.jsp.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	private int id;
	private String sName;
	private String address;
	@OneToMany
	private List<Student> st;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Student> getSt() {
		return st;
	}
	public void setSt(List<Student> st) {
		this.st = st;
	}
}
