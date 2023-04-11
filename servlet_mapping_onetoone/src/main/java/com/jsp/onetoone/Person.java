package com.jsp.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne  // to establish mapping with other Entity class object ( if we use this in one class then we can say it as uni-directional one )
    private Aadhaar ad; // other Entity class object
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
	public Aadhaar getAd() {
		return ad;
	}
	public void setAd(Aadhaar ad) {
		this.ad = ad;
	}
	
}
