package com.jsp.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	private int id;
	private String sPN;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsPN() {
		return sPN;
	}
	public void setsPN(String sPN) {
		this.sPN = sPN;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
