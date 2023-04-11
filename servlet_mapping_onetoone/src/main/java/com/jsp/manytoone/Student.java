package com.jsp.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToOne
	private School sch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSch() {
		return sch;
	}
	public void setSchool(School sch) {
		this.sch = sch;
	}
}
